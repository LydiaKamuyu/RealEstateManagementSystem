
import java.awt.Color;
import javax.swing.JFrame;


public class Main_Form extends javax.swing.JFrame {
 public Main_Form() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_propertytype = new javax.swing.JLabel();
        jLabel_sales = new javax.swing.JLabel();
        jLabel_owner = new javax.swing.JLabel();
        jLabel_client = new javax.swing.JLabel();
        jLabel_property = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1_icon.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real_estate_system/javalogo.jpg"))); // NOI18N
        jLabel1_icon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1_icon.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setText("ThE rEaL dEaL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 643, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        jLabel_propertytype.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_propertytype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_propertytype.setForeground(new java.awt.Color(255, 255, 204));
        jLabel_propertytype.setText("Property-Type");
        jLabel_propertytype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_propertytype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_propertytype.setOpaque(true);
        jLabel_propertytype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_propertytypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_propertytypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_propertytypeMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_propertytype, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 114, 24));

        jLabel_sales.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_sales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_sales.setForeground(new java.awt.Color(255, 255, 204));
        jLabel_sales.setText("Sales");
        jLabel_sales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jLabel_sales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_sales.setOpaque(true);
        jLabel_sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_salesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_salesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_salesMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 114, 24));

        jLabel_owner.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_owner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_owner.setForeground(new java.awt.Color(255, 255, 204));
        jLabel_owner.setText("Owner");
        jLabel_owner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_owner.setOpaque(true);
        jLabel_owner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ownerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ownerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ownerMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_owner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 114, 24));

        jLabel_client.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_client.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_client.setForeground(new java.awt.Color(255, 255, 204));
        jLabel_client.setText("Client");
        jLabel_client.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_client.setOpaque(true);
        jLabel_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_clientMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 276, 114, 24));

        jLabel_property.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_property.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_property.setForeground(new java.awt.Color(255, 255, 204));
        jLabel_property.setText("Property");
        jLabel_property.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_property.setOpaque(true);
        jLabel_property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_propertyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_propertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_propertyMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_property, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 114, 24));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real_estate_system/What-You-Need-to-Know-about-the-Rental-Property-Business-e1544513424166.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 440, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_propertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertyMouseEntered
        jLabel_property.setBackground(Color.white);
        jLabel_property.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_propertyMouseEntered

    private void jLabel_propertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertyMouseExited
        jLabel_property.setBackground(new Color(102,102,102));
        jLabel_property.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_propertyMouseExited

    private void jLabel_propertytypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertytypeMouseEntered
        // TODO add your handling code here:
        jLabel_propertytype.setBackground(Color.white);
        jLabel_propertytype.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_propertytypeMouseEntered

    private void jLabel_propertytypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertytypeMouseExited
        // TODO add your handling code here:
        jLabel_propertytype.setBackground(new Color(102,102,102));
        jLabel_propertytype.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_propertytypeMouseExited

    private void jLabel_salesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salesMouseEntered
        // TODO add your handling code here:
        jLabel_sales.setBackground(Color.white);
        jLabel_sales.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_salesMouseEntered

    private void jLabel_salesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salesMouseExited
        // TODO add your handling code here:
        jLabel_sales.setBackground(new Color(102,102,102));
        jLabel_sales.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_salesMouseExited

    private void jLabel_ownerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ownerMouseEntered
        // TODO add your handling code here:
        jLabel_owner.setBackground(Color.white);
        jLabel_owner.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_ownerMouseEntered

    private void jLabel_ownerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ownerMouseExited
        // TODO add your handling code here:
        jLabel_owner.setBackground(new Color(102,102,102));
        jLabel_owner.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_ownerMouseExited

    private void jLabel_clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clientMouseEntered
        // TODO add your handling code here:
        jLabel_client.setBackground(Color.white);
        jLabel_client.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_clientMouseEntered

    private void jLabel_clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clientMouseExited
        // TODO add your handling code here:
        jLabel_client.setBackground(new Color(102,102,102));
        jLabel_client.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_clientMouseExited

    private void jLabel_propertytypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertytypeMouseClicked
        PROPERTY_TYPE_WINDOW typeform=new PROPERTY_TYPE_WINDOW();
                   typeform.setVisible(true);
                   typeform.pack();
                   typeform.setLocationRelativeTo(null);
                typeform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
                   
                   
    }//GEN-LAST:event_jLabel_propertytypeMouseClicked

    private void jLabel_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clientMouseClicked
         CLIENT_WINDOW clientform=new CLIENT_WINDOW();
                   clientform.setVisible(true);
                   clientform.pack();
                   clientform.setLocationRelativeTo(null);
                clientform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
                   
        
    }//GEN-LAST:event_jLabel_clientMouseClicked

    private void jLabel_ownerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ownerMouseClicked
        OWNER_TYPE ownerform=new OWNER_TYPE();
                   ownerform.setVisible(true);
                   ownerform.pack();
                   ownerform.setLocationRelativeTo(null);
                ownerform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
                   
    }//GEN-LAST:event_jLabel_ownerMouseClicked

    private void jLabel_propertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertyMouseClicked

        PROPERTY_WINDOW propertyform=new PROPERTY_WINDOW();
                   propertyform.setVisible(true);
                   propertyform.pack();
                   propertyform.setLocationRelativeTo(null);
                propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
    }//GEN-LAST:event_jLabel_propertyMouseClicked

    private void jLabel_salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salesMouseClicked
        SALES_WINDOW salesform=new SALES_WINDOW();
                   salesform.setVisible(true);
                   salesform.pack();
                   salesform.setLocationRelativeTo(null);
                salesform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
    }//GEN-LAST:event_jLabel_salesMouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_client;
    private javax.swing.JLabel jLabel_owner;
    private javax.swing.JLabel jLabel_property;
    private javax.swing.JLabel jLabel_propertytype;
    private javax.swing.JLabel jLabel_sales;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
