
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LOGIN_WINDOW extends javax.swing.JFrame {

    
    public LOGIN_WINDOW() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton_login = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("REAL ESTATE MANAGEMENT SYSTEM");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REAL ESTATE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 690, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real_estate_system/realestate5.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 490));

        jPanel4.setBackground(new java.awt.Color(102, 0, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PASSWORD");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 104, 27));

        jTextField2_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2_usernameFocusLost(evt);
            }
        });
        jTextField2_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_usernameActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 104, 27));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 10));

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, -1));

        jButton_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_login.setText("LOGIN");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 30));

        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 200, 470));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 690, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_usernameActionPerformed

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        
        String username =jTextField2_username.getText();
        String password =String.valueOf(jPasswordField1.getPassword());
        
        PreparedStatement ps;
        ResultSet rs;
        
        String selectquery ="SELECT * FROM `users` WHERE `username` =? AND password =?";
           if(username.trim().toLowerCase().equals("username") ||
                   password.trim().toLowerCase().equals("password"))
           {
               JOptionPane.showMessageDialog(null,"ENTER YOUR USERNAME AND PASSWORD FIRST","Empty Field",2);
           }
           else{
               
            try {
                ps = (PreparedStatement) THE_CONNECTION.getTheConnection().prepareStatement(selectquery);
                
                ps.setString(1, username);
                ps.setString(2, password);
                
                rs=ps.executeQuery();
                
                if(rs.next())
                {
                   Main_Form mainform=new Main_Form();
                   mainform.setVisible(true);
                   
                   mainform.pack();
                  
                   
                   this.dispose(); //clode
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password","Wrong Data",2);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
            }
              
           }
        
        
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jTextField2_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2_usernameFocusGained
        // TODO add your handling code here:
        if(jTextField2_username.getText().trim().toLowerCase().equals("username"))
                {
                    jTextField2_username.setText("");
                     jTextField2_username.setForeground(Color.black);
                   
                }
                   
    }//GEN-LAST:event_jTextField2_usernameFocusGained

    private void jTextField2_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2_usernameFocusLost
        // TODO add your handling code here:
         if(jTextField2_username.getText().trim().equals("") ||
             jTextField2_username.getText().trim().toLowerCase().equals("username"))
         {
             jTextField2_username.setText("username");
                     jTextField2_username.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_jTextField2_usernameFocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        String password = String.valueOf(jPasswordField1.getPassword());
        if(password.trim().toLowerCase().equals("password"))
                {
                    jPasswordField1.setText("");
                     jPasswordField1.setForeground(Color.black);
                   
                }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
        
        String password = String.valueOf(jPasswordField1.getPassword());
        
        if(password.trim().equals("") ||
             password.trim().toLowerCase().equals("password"))
         {
             jPasswordField1.setText("username");
                     jPasswordField1.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2_username;
    // End of variables declaration//GEN-END:variables
}
