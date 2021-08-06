
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_Sales {
    
    private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;
    
    public P_Sales(){}
        public P_Sales(int ID,int PROPERTY_ID,int CLIENT_ID,String FINAL_PRICE,String SELLING_DATE)
        {
            this.id=ID;
            this.propertyId=PROPERTY_ID;
            this.clientId=CLIENT_ID;
            this.finalPrice=FINAL_PRICE;
            this.sellingDate=SELLING_DATE;
            
            
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalprice) {
        this.finalPrice = finalprice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    public boolean addNewSales(P_Sales sales)
{
    
    PreparedStatement ps;
    
    String addQuery = "INSERT INTO `sales`(`property_id`, `client_id`, `final_price`, `sales_date`) VALUES (?,?,?,?)";
    
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1, sales.getPropertyId());
            ps.setInt(2, sales.getClientId());
            ps.setString(3, sales.getFinalPrice());
            ps.setString(4, sales.getSellingDate());
           
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return false;
    
}


public boolean editSales(P_Sales sales)
{
     PreparedStatement ps;
    
    String editQuery = "UPDATE `sales` SET `property_id`=?,`client_id`=?,`final_price`=?,`sales_date`=? WHERE `id`=?";
    
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
             ps.setInt(1, sales.getPropertyId());
            ps.setInt(2, sales.getClientId());
            ps.setString(3, sales.getFinalPrice());
            ps.setString(4, sales.getSellingDate());
           ps.setInt(5, sales.getId());
           
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Sales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
}

public boolean deleteSales(int salesId)
{
     PreparedStatement ps;
    
    String deleteQuery = "DELETE FROM `sales` WHERE `id`=?";
    
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
           
            ps.setInt(1, salesId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Sales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

   public ArrayList<P_Sales> salesList()
{
     ArrayList<P_Sales> list=new ArrayList<>();
     Statement st;
     ResultSet  rs;
     
     String selectQuery="SELECT * FROM `sales`";
     
        try {
            
            st=THE_CONNECTION.getTheConnection().createStatement();
            rs=st.executeQuery(selectQuery);
            
            P_Sales sales;
            
            while(rs.next()){
                 sales =new P_Sales(rs.getInt(1),
                                   rs.getInt(2),
                                    rs.getInt(3),
                                    rs.getString(4),
                                    rs.getString(5));
                                
                 list.add(sales);
                         
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     return list;
}
}
