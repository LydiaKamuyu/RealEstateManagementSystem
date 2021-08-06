
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_Client {
    
    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String address;
    
     public Integer getId()
    {
    return id;
    }
    public void setId(Integer ID)
    {
    this.id=ID;
    }
    
    public String getFname()
    {
    return firstname;
}
public void setFname(String FNAME)
    {
    this.firstname=FNAME;
    
}
    public String getLname()
    {
    return lastname;
}
public void setLname(String LNAME)
    {
    this.lastname=LNAME;
    
}
public String getPhone()
    {
    return phone;
}
public void setPhone(String PHONE)
    {
    this.phone=PHONE;
    
}
public String getEmail()
    {
    return email;
}
public void setEmail(String EMAIL)
    {
    this.email=EMAIL;
    
}
public String getAddress()
    {
    return address;
}
public void setAdress(String ADDRESS)
    {
    this.address=ADDRESS;
    
    
    
}

public P_Client() {}
public P_Client(int ID, String FNAME, String LNAME, String PHONE, String EMAIL, String ADDRESS)
{
    this.id=ID;
    this.firstname=FNAME;
    this.lastname=LNAME;
    this.phone=PHONE;
    this.email=EMAIL;
    this.address=ADDRESS;
}
        
public boolean addNewClient(P_Client client)
{
    
    PreparedStatement ps;
    
    String addQuery = "INSERT INTO `property_client`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
    
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setString(1, client.getFname());
            ps.setString(2, client.getLname());
            ps.setString(3, client.getPhone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return false;
    
}


public boolean editClientData(P_Client client)
{
     PreparedStatement ps;
    
    String editQuery = "UPDATE `property_client` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
    
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setString(1, client.getFname());
            ps.setString(2, client.getLname());
            ps.setString(3, client.getPhone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            ps.setInt(6, client.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
}

public boolean deleteClient(int clientId)
{
     PreparedStatement ps;
    
    String deleteQuery = "DELETE FROM `property_client` WHERE `id`=?";
    
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
           
            ps.setInt(1, clientId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
}

public ArrayList<P_Client> clientsList()
{
     ArrayList<P_Client> list=new ArrayList<>();
     Statement st;
     ResultSet  rs;
     
     String selectQuery="SELECT * FROM `property_client`";
     
        try {
            
            st=THE_CONNECTION.getTheConnection().createStatement();
            rs=st.executeQuery(selectQuery);
            
            P_Client client;
            
            while(rs.next()){
                 client =new P_Client(rs.getInt(1),
                                   rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6));
                 list.add(client);
                         
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     return list;
}
}

