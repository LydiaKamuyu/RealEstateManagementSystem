
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PROPERTY_WINDOW extends javax.swing.JFrame {

   
    P_Type type=new P_Type();
        HashMap<String, Integer>map=type.getTypesMap();
    public PROPERTY_WINDOW() {
        initComponents();
        
        bindCombo();
    }

    public void bindCombo()
    {
        
        
         for(String s: map.keySet())   
         {
             jComboBox_Type.addItem(s);
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel_title3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton_editProperty = new javax.swing.JButton();
        jButton_showproperties = new javax.swing.JButton();
        jButton_addProperty = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jTextField_OwnerId = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jComboBox_Type = new javax.swing.JComboBox<>();
        jTextField_SquareFeet = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSpinner_Bedrooms = new javax.swing.JSpinner();
        jSpinner_Bathrooms = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jSpinner_Age = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jCheckBox_Pool = new javax.swing.JCheckBox();
        jCheckBox_Balcone = new javax.swing.JCheckBox();
        jCheckBox_Backyard = new javax.swing.JCheckBox();
        jCheckBox_Gymnesium = new javax.swing.JCheckBox();
        jCheckBox_Garage = new javax.swing.JCheckBox();
        jButton_removeProperty1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(204, 204, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_title3.setBackground(new java.awt.Color(255, 0, 153));
        jPanel_title3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel7.setText("PrOpErTy");

        javax.swing.GroupLayout jPanel_title3Layout = new javax.swing.GroupLayout(jPanel_title3);
        jPanel_title3.setLayout(jPanel_title3Layout);
        jPanel_title3Layout.setHorizontalGroup(
            jPanel_title3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_title3Layout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(370, 370, 370))
        );
        jPanel_title3Layout.setVerticalGroup(
            jPanel_title3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel_title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 38));

        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 85, 34));

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 280, 100));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ADDRESS:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("TYPE:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 32));

        jButton_editProperty.setBackground(new java.awt.Color(255, 0, 153));
        jButton_editProperty.setText("EDIT");
        jButton_editProperty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_editProperty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_editProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editPropertyActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_editProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 501, 132, 32));

        jButton_showproperties.setBackground(new java.awt.Color(102, 255, 102));
        jButton_showproperties.setText("Show Properties");
        jButton_showproperties.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_showproperties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_showproperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_showpropertiesActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_showproperties, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 240, 32));

        jButton_addProperty.setBackground(new java.awt.Color(0, 0, 255));
        jButton_addProperty.setText("ADD");
        jButton_addProperty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_addProperty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addPropertyActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_addProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 501, 129, 32));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("OWNER ID:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("PRICE(usd):");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 32));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("BEDROOMS:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 32));

        jTextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 190, 34));

        jTextField_OwnerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_OwnerIdActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_OwnerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 190, 33));

        jButton_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_search.setText("Search");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 90, 38));

        jComboBox_Type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(jComboBox_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 190, -1));

        jTextField_SquareFeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SquareFeetActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_SquareFeet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, 34));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("DESCRIPTION\\COMMENTS:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, 32));

        jSpinner_Bedrooms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jSpinner_Bedrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 120, 30));

        jSpinner_Bathrooms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jSpinner_Bathrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 120, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("BATHROOMS:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 32));

        jSpinner_Age.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jSpinner_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 120, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("AGE OF THE HOUSE:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("0 for New");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 70, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("SQUARE FEET:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 32));

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Address);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 190, 51));

        jCheckBox_Pool.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Pool.setText("SWIMMING POOL");
        jPanel5.add(jCheckBox_Pool, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 140, 30));

        jCheckBox_Balcone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Balcone.setText("BALCONE");
        jPanel5.add(jCheckBox_Balcone, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 140, 30));

        jCheckBox_Backyard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Backyard.setText("BACKYARD");
        jPanel5.add(jCheckBox_Backyard, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 140, 30));

        jCheckBox_Gymnesium.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Gymnesium.setText("GYMNESIUM");
        jPanel5.add(jCheckBox_Gymnesium, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 140, 30));

        jCheckBox_Garage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox_Garage.setText("GARAGE");
        jPanel5.add(jCheckBox_Garage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 140, 30));

        jButton_removeProperty1.setBackground(new java.awt.Color(255, 0, 0));
        jButton_removeProperty1.setText("REMOVE");
        jButton_removeProperty1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_removeProperty1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_removeProperty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeProperty1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_removeProperty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 501, 146, 32));

        jDesktopPane1.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jButton_editPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editPropertyActionPerformed
try{
        int id=Integer.valueOf(jTextField_Id.getText());
        int type=map.get(jComboBox_Type.getSelectedItem().toString());
        
        int ownerId=Integer.valueOf(jTextField_OwnerId.getText());
        int squarefeet=Integer.valueOf(jTextField_SquareFeet.getText());
        int bedrooms=Integer.valueOf(jSpinner_Bedrooms.getValue().toString());
        int bathrooms=Integer.valueOf(jSpinner_Bathrooms.getValue().toString());
        int age=Integer.valueOf(jSpinner_Age.getValue().toString());
        boolean haveBalcone=false;
        boolean haveBackyard=false;
        boolean haveGarage=false;
        boolean haveGymnesium=false;
        boolean havePool=false;
        
        if(jCheckBox_Balcone.isSelected()) haveBalcone=true;
        if(jCheckBox_Backyard.isSelected()) haveBackyard=true;
        if(jCheckBox_Garage.isSelected()) haveGarage=true;
        if(jCheckBox_Gymnesium.isSelected()) haveGymnesium=true;
        if(jCheckBox_Pool.isSelected()) havePool=true;
        
        String price=jTextField_Price.getText();
        String address=jTextArea_Address.getText();
        String description=jTextArea_Description.getText();
        
        P_Property property=new P_Property(id,type,squarefeet,ownerId,price,address,bedrooms,bathrooms,age,haveBalcone,haveBackyard,haveGarage,haveGymnesium,havePool,description);
        
        if(new P_Property().editProperty(property))
        {
            
                JOptionPane.showMessageDialog(null,"Property data Updated","Edit Property",1);}
            else{
                JOptionPane.showMessageDialog(null,"Property Not Updated","Edit Property",2);
            
        }
    }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ERROR","ERROR",0);
        }

       
        
    }//GEN-LAST:event_jButton_editPropertyActionPerformed

    private void jButton_showpropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_showpropertiesActionPerformed
SHOW_PROPERTIES_WINDOW showpropertiesform=new SHOW_PROPERTIES_WINDOW();
                   showpropertiesform.setVisible(true);
                   showpropertiesform.pack();
                   showpropertiesform.setLocationRelativeTo(null);
                showpropertiesform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);           
    }//GEN-LAST:event_jButton_showpropertiesActionPerformed

    private void jButton_addPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addPropertyActionPerformed
    try{
        
        int type=map.get(jComboBox_Type.getSelectedItem().toString());
        
        int ownerId=Integer.valueOf(jTextField_OwnerId.getText());
        int squarefeet=Integer.valueOf(jTextField_SquareFeet.getText());
        int bedrooms=Integer.valueOf(jSpinner_Bedrooms.getValue().toString());
        int bathrooms=Integer.valueOf(jSpinner_Bathrooms.getValue().toString());
        int age=Integer.valueOf(jSpinner_Age.getValue().toString());
        boolean haveBalcone=false;
        boolean haveBackyard=false;
        boolean haveGarage=false;
        boolean haveGymnesium=false;
        boolean havePool=false;
        
        if(jCheckBox_Balcone.isSelected()) haveBalcone=true;
        if(jCheckBox_Backyard.isSelected()) haveBackyard=true;
        if(jCheckBox_Garage.isSelected()) haveGarage=true;
        if(jCheckBox_Gymnesium.isSelected()) haveGymnesium=true;
        if(jCheckBox_Pool.isSelected()) havePool=true;
        
        String price=jTextField_Price.getText();
        String address=jTextArea_Address.getText();
        String description=jTextArea_Description.getText();
        
        P_Property property=new P_Property(0,type,squarefeet,ownerId,price,address,bedrooms,bathrooms,age,haveBalcone,haveBackyard,haveGarage,haveGymnesium,havePool,description);
        
        if(new P_Property().addNewProperty(property))
        {
            
                JOptionPane.showMessageDialog(null,"New Property added to the System","Add Property",1);}
            else{
                JOptionPane.showMessageDialog(null,"Property Not added to the System","Add Property",2);
            
        }
    }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ERROR","ERROR",0);
        }

    }//GEN-LAST:event_jButton_addPropertyActionPerformed

    private void jTextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceActionPerformed

    private void jTextField_OwnerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_OwnerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_OwnerIdActionPerformed

    private void jTextField_SquareFeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SquareFeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SquareFeetActionPerformed

    private void jButton_removeProperty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeProperty1ActionPerformed
 try{

            int id=Integer.valueOf(jTextField_Id.getText());

            P_Property property=new P_Property();
            if(jTextField_Id.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Enter Property ID","Empty ID",2);
            }
            else{
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Property","Delete Property", JOptionPane.YES_NO_OPTION);

                if(yes_or_no==JOptionPane.YES_OPTION)

                {
                    if(property.removeProperty(id))
                    {
                        JOptionPane.showMessageDialog(null,"Property Data Deleted","Delete Property",1);
                    }else{
                        JOptionPane.showMessageDialog(null,"Operation Failed","Delete Property",2);
                    }
                }
            }
        }   catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter a valid Property ID","Invalid Property ID",0);
        }
        
        
        
    }//GEN-LAST:event_jButton_removeProperty1ActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        try{
            
            int propertyId=Integer.valueOf(jTextField_Id.getText());
            P_Property property=new P_Property().findProperty(propertyId);
            
            if(property !=null)
            {
                jTextArea_Address.setText(property.getAddress());
                jTextArea_Description.setText(property.getDescription());
                jTextField_Price.setText(property.getPrice());
                jTextField_SquareFeet.setText(String.valueOf(property.getSize()));
                jTextField_OwnerId.setText(String.valueOf(property.getOwnerId()));
                jTextField_SquareFeet.setText(String.valueOf(property.getSize()));
                
                //jComboBox_Type.setSelectedItem(map.get(property.getType()));
                
                for(Object type : map.keySet())
                {
                    if(map.get(type).equals(property.getType()))
                        jComboBox_Type.setSelectedItem(type);
                    
                }
                jSpinner_Bedrooms.setValue(property.getBedrooms());
                jSpinner_Bathrooms.setValue(property.getBathrooms());
                 jSpinner_Age.setValue(property.getAge());
                
                if(property.isBalcone()) jCheckBox_Balcone.setSelected(true);
                if(property.isBackyard()) jCheckBox_Backyard.setSelected(true);
                if(property.isGarage()) jCheckBox_Garage.setSelected(true);
                if(property.isGymnesium()) jCheckBox_Gymnesium.setSelected(true);
                if(property.isPool()) jCheckBox_Pool.setSelected(true);
                
            }else{
               JOptionPane.showMessageDialog(null,"PROPERTY NOT FOUND","ERROR",0); 
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ERROR","ERROR",0);
        }
        
    }//GEN-LAST:event_jButton_searchActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addProperty;
    private javax.swing.JButton jButton_editProperty;
    private javax.swing.JButton jButton_removeProperty1;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_showproperties;
    private javax.swing.JCheckBox jCheckBox_Backyard;
    private javax.swing.JCheckBox jCheckBox_Balcone;
    private javax.swing.JCheckBox jCheckBox_Garage;
    private javax.swing.JCheckBox jCheckBox_Gymnesium;
    private javax.swing.JCheckBox jCheckBox_Pool;
    private javax.swing.JComboBox<String> jComboBox_Type;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_title3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_Age;
    private javax.swing.JSpinner jSpinner_Bathrooms;
    private javax.swing.JSpinner jSpinner_Bedrooms;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_OwnerId;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_SquareFeet;
    // End of variables declaration//GEN-END:variables
}
