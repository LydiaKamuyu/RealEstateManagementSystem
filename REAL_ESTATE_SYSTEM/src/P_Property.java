
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_Property {
    private int id;
    private int type;
    private int size;
    private int ownerId;
    private String price;
    private String address;
    private int bedrooms;
    private int bathrooms;
    private int age;
    private boolean  balcone;
     private boolean  backyard;
      private boolean  garage;
       private boolean  gymnesium;
        private boolean  pool;
        private String description;
        
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBalcone() {
        return balcone;
    }

    public void setBalcone(boolean balcone) {
        this.balcone = balcone;
    }

    public boolean isBackyard() {
        return backyard;
    }

    public void setBackyard(boolean backyard) {
        this.backyard = backyard;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isGymnesium() {
        return gymnesium;
    }

    public void setGymnesium(boolean gymnesium) {
        this.gymnesium = gymnesium;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
        public P_Property(){}
         public P_Property(int ID,int TYPE,int SIZE,int OWNERID,String PRICE,String ADRESS,int BEDROOMS,int BATHROOMS,int HOUSEAGE,
                 boolean BALCONE,boolean BACKYARD,boolean GARAGE,boolean GYMNESIUM,boolean POOL,String DESCRIPTION)
         {
             this.id=ID;
             this.type=TYPE;
             this.size=SIZE;
             this.ownerId=OWNERID;
             this.price=PRICE;
             this.address=ADRESS;
             this.bedrooms=BEDROOMS;
             this.bathrooms=BATHROOMS;
             this.age=HOUSEAGE;
             this.description=DESCRIPTION;
             this.balcone=BALCONE;
             this.backyard=BACKYARD;
             this.garage=GARAGE;
             this.gymnesium=GYMNESIUM;
             this.pool=POOL;
            
             
}

    public boolean addNewProperty(P_Property property)
    {
         PreparedStatement ps;
    
    String addQuery = "INSERT INTO `the_property`(`type`, `square_feet`, `ownerId`, `price`, `address`, `bedrooms`, `bathrooms`, `houseAge`, `balcone`, `backyard`, `garage`, `gymnesium`, `swimming_pool`, `description`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1, property.getType());
            ps.setInt(2, property.getSize());
            ps.setInt(3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString(5, property.getAddress());
            ps.setInt(6, property.getBedrooms());
            ps.setInt(7, property.getBathrooms());
            ps.setInt(8, property.getAge());
            ps.setBoolean(9, property.isBalcone());
            ps.setBoolean(10, property.isBackyard());
            ps.setBoolean(11, property.isGarage());
            ps.setBoolean(12, property.isGymnesium());
            ps.setBoolean(13, property.isPool());
            ps.setString(14, property.getDescription());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
      
    }
     public boolean editProperty(P_Property property)
    {
         PreparedStatement ps;
    
    String editQuery = "UPDATE `the_property` SET `type`=?,`square_feet`=?,`ownerId`=?,`price`=?,`address`=?,`bedrooms`=?,`bathrooms`=?,`houseAge`=?,`balcone`=?,`backyard`=?,`garage`=?,`gymnesium`=?,`swimming_pool`=?,`description`=? WHERE `id`=?";
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1, property.getType());
            ps.setInt(2, property.getSize());
            ps.setInt(3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString(5, property.getAddress());
            ps.setInt(6, property.getBedrooms());
            ps.setInt(7, property.getBathrooms());
            ps.setInt(8, property.getAge());
            ps.setBoolean(9, property.isBalcone());
            ps.setBoolean(10, property.isBackyard());
            ps.setBoolean(11, property.isGarage());
            ps.setBoolean(12, property.isGymnesium());
            ps.setBoolean(13, property.isPool());
            ps.setString(14, property.getDescription());
            ps.setInt(15, property.getId());
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
      public boolean removeProperty(int propertyId)
    {
        PreparedStatement ps;
    
    String deleteQuery = "DELETE FROM `the_property` WHERE `id`=?";
    
    
        try {
            ps =THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
           
            ps.setInt(1, propertyId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
      public P_Property findProperty(int propertyId)
    {
        PreparedStatement ps;
        ResultSet rs;
        P_Property property=null;
        
        String searchQuery="SELECT * FROM `the_property` WHERE `id`=?";
        
                
        try {
            
            
            ps =THE_CONNECTION.getTheConnection().prepareStatement(searchQuery);
            
            ps.setInt(1,propertyId );
            
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                property=new P_Property(rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerId"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("houseage"),
                        rs.getBoolean("balcone"),
                       rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getBoolean("Gymnesium"),
                        rs.getBoolean("swimming_pool"),                       
                        rs.getString("description"));
            }
            return property;
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Property.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return property;
    }
      
      public ArrayList<P_Property> propertiesList()
      {
          
         ArrayList<P_Property> list=new ArrayList<>(); 
        Statement st;
     ResultSet  rs;
     
     String selectQuery="SELECT * FROM `the_property`";
     
        try {
            
            st=THE_CONNECTION.getTheConnection().createStatement();
            rs=st.executeQuery(selectQuery);
            
            P_Property property;
            
            while(rs.next()){
                   property=new P_Property(rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerId"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("houseage"),
                        rs.getBoolean("balcone"),
                       rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getBoolean("Gymnesium"),
                        rs.getBoolean("swimming_pool"),                       
                        rs.getString("description"));
                 list.add(property);
                         
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(P_Property.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     return list;
}
     
}

