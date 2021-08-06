
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class OWNER_TYPE extends javax.swing.JFrame {

   
    public OWNER_TYPE() {
        initComponents();
        
        fillJTableWithOwnersData();
    }

    public void fillJTableWithOwnersData()
    {
        P_Owner owner=new P_Owner();
        ArrayList<P_Owner> ownersList=owner.ownersList();
        
        String[] colNames={"ID","First Name","Last Name","Phone","Email","Address"};
        
        Object[][] rows=new Object[ownersList.size()][6];
        
        for(int i=0; i<ownersList.size();i++)
        {
            rows[i][0]=ownersList.get(i).getId();
            rows[i][1]=ownersList.get(i).getFname();
            rows[i][2]=ownersList.get(i).getLname();
            rows[i][3]=ownersList.get(i).getPhone();
            rows[i][4]=ownersList.get(i).getEmail();
            rows[i][5]=ownersList.get(i).getAddress();
        }
        DefaultTableModel model=new DefaultTableModel(rows,colNames);
        jTable1.setModel(model);
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(Color.orange);
          
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel_title3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Fname = new javax.swing.JTextField();
        jButton_editowner = new javax.swing.JButton();
        jButton_removeowner = new javax.swing.JButton();
        jButton_refreshowner = new javax.swing.JButton();
        jButton_addowner = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_Lname = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jTextField_phone = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jPanel_title3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel_title3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel7.setText(" OwNeR");

        javax.swing.GroupLayout jPanel_title3Layout = new javax.swing.GroupLayout(jPanel_title3);
        jPanel_title3.setLayout(jPanel_title3Layout);
        jPanel_title3Layout.setHorizontalGroup(
            jPanel_title3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_title3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        jPanel_title3Layout.setVerticalGroup(
            jPanel_title3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");

        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jTextArea_address.setColumns(20);
        jTextArea_address.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea_address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_address);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ADDRESS:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("FIRST NAME:");

        jTextField_Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FnameActionPerformed(evt);
            }
        });

        jButton_editowner.setBackground(new java.awt.Color(255, 0, 153));
        jButton_editowner.setText("EDIT");
        jButton_editowner.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_editowner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_editowner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editownerActionPerformed(evt);
            }
        });

        jButton_removeowner.setBackground(new java.awt.Color(255, 0, 0));
        jButton_removeowner.setText("REMOVE");
        jButton_removeowner.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_removeowner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_removeowner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeownerActionPerformed(evt);
            }
        });

        jButton_refreshowner.setBackground(new java.awt.Color(0, 255, 0));
        jButton_refreshowner.setText("REFRESH");
        jButton_refreshowner.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_refreshowner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refreshowner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshownerActionPerformed(evt);
            }
        });

        jButton_addowner.setBackground(new java.awt.Color(0, 0, 255));
        jButton_addowner.setText("ADD");
        jButton_addowner.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_addowner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addowner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addownerActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("PHONE:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("EMAIL:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("LAST NAME:");

        jTextField_Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LnameActionPerformed(evt);
            }
        });

        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });

        jTextField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_phoneActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton_addowner, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton_editowner, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_removeowner, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jButton_refreshowner, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel10))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel_title3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jTextField_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_addowner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_editowner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_removeowner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_refreshowner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jTextField_FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FnameActionPerformed

    private void jButton_editownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editownerActionPerformed
        
        
        String fname=jTextField_Fname.getText();
        String lname=jTextField_Lname.getText();
        String phone=jTextField_phone.getText();
        String email=jTextField_email.getText();
        String address=jTextArea_address.getText();
        
        P_Owner owner=new P_Owner();
        try{
            int ownerId=Integer.valueOf(jTextField_Id.getText());
            
            if( fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter the Owner Required Information[firstname,lastname,phone,email,address]","Edit Owner",2);
            
        }   else
        {
           if(owner.editOwnerData(new P_Owner(ownerId,fname,lname,phone,email,address)))
        {
            JOptionPane.showMessageDialog(null,"Owner Data Edited","Edit Owner",1);}
        else{
                JOptionPane.showMessageDialog(null,"Owner Data Not Edited","Edit Owner",2);
           }
                }
        
        }catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter a valid Owner ID","Invalid Owner ID",0);
       }
      
    }//GEN-LAST:event_jButton_editownerActionPerformed

    private void jButton_removeownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeownerActionPerformed
try{
    
    int ownerId=Integer.valueOf(jTextField_Id.getText());
        
        P_Owner owner=new P_Owner();
        if(jTextField_Id.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter Owner ID","Empty ID",2);
        }
        else{
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Owner","Delete Owner", JOptionPane.YES_NO_OPTION);
            
            if(yes_or_no==JOptionPane.YES_OPTION)
                
            {
                if(owner.deleteOwner(ownerId))
                {
                    JOptionPane.showMessageDialog(null,"Owner Data Deleted","Remove Owner",1);
                }else{
                    JOptionPane.showMessageDialog(null,"Operation Failed","Remove Owner",2);
                }
            }
        }
}   catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter a valid Owner ID","Invalid Owner ID",0);
       }    
        
    }//GEN-LAST:event_jButton_removeownerActionPerformed
    
    private void jButton_addownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addownerActionPerformed
        String fname=jTextField_Fname.getText();
        String lname=jTextField_Lname.getText();
        String phone=jTextField_phone.getText();
        String email=jTextField_email.getText();
        String address=jTextArea_address.getText();
        
        P_Owner owner=new P_Owner();
        
        if( fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter the Owner Required Information[firstname,lastname,phone,email,address]","Add Owner",2);
            
        }   else
        {
           if(owner.addNewOwner(new P_Owner(0,fname,lname,phone,email,address)))
        {
            JOptionPane.showMessageDialog(null,"New Owner added to the System","Add Owner",1);}
        else{
                JOptionPane.showMessageDialog(null,"New Owner Not added to the System","Add Owner",2);
                }
        
        }
            
                                        
    }//GEN-LAST:event_jButton_addownerActionPerformed

    private void jButton_refreshownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshownerActionPerformed
        
        fillJTableWithOwnersData();
    }//GEN-LAST:event_jButton_refreshownerActionPerformed

    private void jTextField_LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LnameActionPerformed

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jTextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_phoneActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        int selectedRowIndex=jTable1.getSelectedRow();
        jTextField_Id.setText(jTable1.getValueAt(selectedRowIndex, 0).toString());
        jTextField_Fname.setText(jTable1.getValueAt(selectedRowIndex, 1).toString());
        jTextField_Lname.setText(jTable1.getValueAt(selectedRowIndex, 2).toString());
        jTextField_phone.setText(jTable1.getValueAt(selectedRowIndex, 3).toString());
        jTextField_email.setText(jTable1.getValueAt(selectedRowIndex, 4).toString());
        jTextArea_address.setText(jTable1.getValueAt(selectedRowIndex, 5).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OWNER_TYPE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addowner;
    private javax.swing.JButton jButton_editowner;
    private javax.swing.JButton jButton_refreshowner;
    private javax.swing.JButton jButton_removeowner;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_title3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextField jTextField_Fname;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Lname;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_phone;
    // End of variables declaration//GEN-END:variables
}
