
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_Type {
    
    private int id;
    private String name;
    private String description;
    
    
    public Integer getId()
    {
    return id;
    }
    public void setId(Integer ID)
    {
    this.id=ID;
}
public String getName()
    {
    return name;
}
public void setName(String NAME)
    {
    this.name=NAME;
    
}

public String getDescription()
    {
    return this.description;
}
public void setDescription(String DESCRIPTION)
    {
    this.description=DESCRIPTION;
    
    }
public P_Type(){}
public P_Type(Integer ID,String NAME,String DESCRIPTION)
{
    this.id=ID;
    this.name=NAME;
    this.description=DESCRIPTION;
}

public boolean execTypeQuery(String queryType,P_Type type)
{
    PreparedStatement ps;
    
    
    if(queryType.equals("add"))
    {
        try {
            
            ps = THE_CONNECTION.getTheConnection().prepareStatement("INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)");
            
            ps.setString(1, type.getName());
            ps.setString(2, type.getDescription());   
         
            return (ps.executeUpdate() > 0);
         
         
        } catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
   else if(queryType.equals("edit"))
    {
        try {
            
            ps = THE_CONNECTION.getTheConnection().prepareStatement("UPDATE `property_type` SET `name`=?,`description`=? WHERE `id`=?");
            
            ps.setString(1, type.getName());
            ps.setString(2, type.getDescription());
            ps.setInt(3, type.getId());
         
            return (ps.executeUpdate() > 0);
         
         
        } catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    else if(queryType.equals("remove"))
    {
        try {
            
            ps = THE_CONNECTION.getTheConnection().prepareStatement("DELETE FROM `property_type` WHERE `id`= ?");
            
            ps.setInt(1, type.getId());
         
            return (ps.executeUpdate() > 0);
         
         
        } catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    else{
        return false;
    }
}


public HashMap<String,Integer> getTypesMap()
{
HashMap<String, Integer> map=new HashMap<>();

Statement st;
ResultSet rs;

        try {
            st=THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM `property_type`");
            
            P_Type type;
            while(rs.next())
            {
                type =new P_Type(rs.getInt(1),rs.getString(2),rs.getString(3));
                map.put(type.getName(),type.getId());
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
        }

return map;

}
public P_Type getTypeById(Integer id)
{
    PreparedStatement ps;
ResultSet rs;
P_Type type= new P_Type();;

        try {
            ps=THE_CONNECTION.getTheConnection().prepareStatement("SELECT * FROM `property_type` WHERE `id`=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
           
            if(rs.next())
            {
                
                type.setId(id);
                type.setName(rs.getString(2));
                type.setDescription(rs.getString(3));
            }
            
            
}
        catch (SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type;
}
}