
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PROPERTY_TYPE_WINDOW extends javax.swing.JFrame {

    public PROPERTY_TYPE_WINDOW() {
        initComponents();
        
        fillTypeList();
    }
   
        public void fillTypeList()
                
        {
            P_Type type = new P_Type();
            HashMap<String,Integer> map= type.getTypesMap();
            
            DefaultListModel listModel = new DefaultListModel();
            
            int i = 0;
            
            for(String typeName: map.keySet())
               
            {
              listModel.add(i, typeName);
              
             i++;
                
            }
            jList1.setModel(listModel);
        }
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel_title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_propertyid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_propertydescription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_propertyname = new javax.swing.JTextField();
        jButton_edittype = new javax.swing.JButton();
        jButton_removetype = new javax.swing.JButton();
        jButton_refreshtype = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton_addtype1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jPanel_title.setBackground(new java.awt.Color(255, 255, 153));
        jPanel_title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setText("PrOpErTy TyPe");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jTextField_propertyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_propertyidActionPerformed(evt);
            }
        });

        jTextArea_propertydescription.setColumns(20);
        jTextArea_propertydescription.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea_propertydescription.setRows(5);
        jScrollPane1.setViewportView(jTextArea_propertydescription);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DESCRIPTION:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NAME:");

        jTextField_propertyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_propertynameActionPerformed(evt);
            }
        });

        jButton_edittype.setBackground(new java.awt.Color(255, 0, 153));
        jButton_edittype.setText("EDIT");
        jButton_edittype.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_edittype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edittype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edittypeActionPerformed(evt);
            }
        });

        jButton_removetype.setBackground(new java.awt.Color(255, 0, 0));
        jButton_removetype.setText("REMOVE");
        jButton_removetype.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_removetype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_removetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removetypeActionPerformed(evt);
            }
        });

        jButton_refreshtype.setBackground(new java.awt.Color(0, 255, 0));
        jButton_refreshtype.setText("REFRESH");
        jButton_refreshtype.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_refreshtype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refreshtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshtypeActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jButton_addtype1.setBackground(new java.awt.Color(0, 0, 255));
        jButton_addtype1.setText("ADD");
        jButton_addtype1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_addtype1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addtype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addtype1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton_addtype1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_edittype, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton_removetype, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton_refreshtype, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_propertyname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_propertyid, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_propertyid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_propertyname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_edittype, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_removetype, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_refreshtype, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_addtype1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_edittypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edittypeActionPerformed
        
       try{
            Integer id=Integer.valueOf(jTextField_propertyid.getText());
        String name=jTextField_propertyname.getText();
        String description=jTextArea_propertydescription.getText();
        
        P_Type type=new P_Type(id,name,description);
        
        if(!name.trim().equals(""))
        {
            if(type.execTypeQuery("edit", type))
        {
            JOptionPane.showMessageDialog(null,"Type Updated","Edit Type",1);
        }else{
             JOptionPane.showMessageDialog(null,"Operation Failed","Edit Type",2);
        }
        }
        else{
            
        }
         JOptionPane.showMessageDialog(null,"Enter the Type name","Empty Name",2);
    
       }catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter a valid ID Type","Invalid ID",0);
       }
    }//GEN-LAST:event_jButton_edittypeActionPerformed

    private void jButton_removetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removetypeActionPerformed
        
        
    try{
        Integer id=Integer.valueOf(jTextField_propertyid.getText());
        
        P_Type type=new P_Type(id,"","");
        
        if(!jTextField_propertyid.getText().trim().equals(""))
        {
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Type","Delete Type", JOptionPane.YES_NO_OPTION);
            
            if(yes_or_no==JOptionPane.YES_OPTION)
                
            {
                 if(type.execTypeQuery("remove", type))
        {
            JOptionPane.showMessageDialog(null,"Type Deleted","Remove Type",1);
        }else{
             JOptionPane.showMessageDialog(null,"Operation Failed","Remove Type",2);
        }
        }
            }
           
        else{
            
        }
         JOptionPane.showMessageDialog(null,"Enter the Type ID","Empty ID",2);
    }
        catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter a valid ID Type","Invalid ID",0);
       }
        
    }//GEN-LAST:event_jButton_removetypeActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        P_Type type = new P_Type();
        HashMap<String,Integer> map= type.getTypesMap();
        Integer typeId = map.get(jList1.getSelectedValue());
        type = type.getTypeById(typeId);
        jTextField_propertyid.setText(type.getId().toString());
        jTextField_propertyname.setText(type.getName());
        jTextArea_propertydescription.setText(type.getDescription());
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jTextField_propertyidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_propertyidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_propertyidActionPerformed

    private void jTextField_propertynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_propertynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_propertynameActionPerformed

    private void jButton_refreshtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshtypeActionPerformed
        
        fillTypeList();
    }//GEN-LAST:event_jButton_refreshtypeActionPerformed

    private void jButton_addtype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addtype1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addtype1ActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_TYPE_WINDOW().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addtype1;
    private javax.swing.JButton jButton_edittype;
    private javax.swing.JButton jButton_refreshtype;
    private javax.swing.JButton jButton_removetype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_propertydescription;
    private javax.swing.JTextField jTextField_propertyid;
    private javax.swing.JTextField jTextField_propertyname;
    // End of variables declaration//GEN-END:variables
}
