
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SALES_WINDOW extends javax.swing.JFrame {

    
    public SALES_WINDOW() {
        initComponents();
        
        fillJTableProperties();
        fillJTableClients();
        fillJTableSales();
    }

    public void fillJTableProperties()
    {
        P_Property property=new P_Property();
       
        ArrayList<P_Property> propertyList=property.propertiesList();
        
        String colNames[]={"ID","Owner_Id","Price"};
        
        Object[][] rows=new Object[propertyList.size()][3];
        
        for(int i=0; i<propertyList.size();i++)
        {
            
            rows[i][0]=propertyList.get(i).getId();        
            rows[i][1]=propertyList.get(i).getOwnerId();
             rows[i][2]=propertyList.get(i).getPrice();
        }
    DefaultTableModel model=new DefaultTableModel(rows,colNames);
        jTable_Properties.setModel(model);

    }
    public void fillJTableClients()
    {
        P_Client client=new P_Client();
        ArrayList<P_Client> clientsList=client.clientsList();
        
        String[] colNames={"ID","First Name","Last Name"};
        
        Object[][] rows=new Object[clientsList.size()][3];
        
        for(int i=0; i<clientsList.size();i++)
        {
            rows[i][0]=clientsList.get(i).getId();
            rows[i][1]=clientsList.get(i).getFname();
            rows[i][2]=clientsList.get(i).getLname();
            
        }
    DefaultTableModel model=new DefaultTableModel(rows,colNames);
        jTable_Clients.setModel(model);

    }
     public void fillJTableSales()
    {
        P_Sales sales=new P_Sales();
        ArrayList<P_Sales> salesList=sales.salesList();
        
        String[] colNames={"ID","Property","Client","Price","Date"};
        
        Object[][] rows=new Object[salesList.size()][5];
        
        for(int i=0; i<salesList.size();i++)
        {
            rows[i][0]=salesList.get(i).getId();
            rows[i][1]=salesList.get(i).getPropertyId();
            rows[i][2]=salesList.get(i).getClientId();
             rows[i][3]=salesList.get(i).getFinalPrice();
              rows[i][4]=salesList.get(i).getSellingDate();
            
        }
    DefaultTableModel model=new DefaultTableModel(rows,colNames);
        jTable_Sales.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel_title3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_PropertyID = new javax.swing.JTextField();
        jButton_editsales = new javax.swing.JButton();
        jButton_removesales = new javax.swing.JButton();
        jButton_addsales = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_ClientID = new javax.swing.JTextField();
        jTextField_FinalPrice = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Clients = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Properties = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser_SalesDate = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jButton_refreshSalesTable = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaReceipt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 51, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_title3.setBackground(new java.awt.Color(204, 204, 0));
        jPanel_title3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel7.setText("SaLeS");

        javax.swing.GroupLayout jPanel_title3Layout = new javax.swing.GroupLayout(jPanel_title3);
        jPanel_title3.setLayout(jPanel_title3Layout);
        jPanel_title3Layout.setHorizontalGroup(
            jPanel_title3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_title3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(571, 571, 571))
        );
        jPanel_title3Layout.setVerticalGroup(
            jPanel_title3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel_title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 90, 32, 38));

        jTextField_Id.setForeground(new java.awt.Color(51, 51, 255));
        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 94, 118, 34));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("OWNER ID:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 160, -1, 32));

        jTextField_PropertyID.setForeground(new java.awt.Color(51, 51, 255));
        jTextField_PropertyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PropertyIDActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_PropertyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 154, 201, 34));

        jButton_editsales.setBackground(new java.awt.Color(255, 0, 153));
        jButton_editsales.setText("EDIT");
        jButton_editsales.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_editsales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_editsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editsalesActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_editsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 449, 85, 32));

        jButton_removesales.setBackground(new java.awt.Color(255, 0, 0));
        jButton_removesales.setText("REMOVE");
        jButton_removesales.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_removesales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_removesales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removesalesActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_removesales, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 449, 83, 32));

        jButton_addsales.setBackground(new java.awt.Color(0, 0, 255));
        jButton_addsales.setText("ADD");
        jButton_addsales.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_addsales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addsalesActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_addsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 449, 78, 32));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("PRORETY PRICE:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, -1, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("SALE DATE:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 360, -1, 32));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("CLIENT ID:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 210, -1, 32));

        jTextField_ClientID.setForeground(new java.awt.Color(51, 51, 255));
        jTextField_ClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ClientIDActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_ClientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 211, 201, 34));

        jTextField_FinalPrice.setForeground(new java.awt.Color(51, 51, 255));
        jTextField_FinalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FinalPriceActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField_FinalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 287, 201, 33));

        jTable_Clients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClientsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Clients);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 119, 298, 200));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("RECEIPT AREA");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, 120, 32));

        jTable_Properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_PropertiesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_Properties);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 119, 287, 200));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("PROPERTIES LIST");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 81, -1, 32));

        jDateChooser_SalesDate.setForeground(new java.awt.Color(51, 51, 255));
        jDateChooser_SalesDate.setDateFormatString("dd/MM/yyyy");
        jPanel5.add(jDateChooser_SalesDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 360, 201, 35));

        jTable_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SalesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_Sales);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 389, 600, 116));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("SALES LIST");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 351, -1, 32));

        jButton_refreshSalesTable.setBackground(new java.awt.Color(0, 255, 0));
        jButton_refreshSalesTable.setText("REFRESH");
        jButton_refreshSalesTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_refreshSalesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refreshSalesTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshSalesTableActionPerformed(evt);
            }
        });
        jPanel5.add(jButton_refreshSalesTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 523, 385, 32));

        jTextAreaReceipt.setColumns(20);
        jTextAreaReceipt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextAreaReceipt.setRows(5);
        jScrollPane1.setViewportView(jTextAreaReceipt);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 117, 300, 300));

        jButton1.setText("GENERATE RECEIPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 440, 300, 35));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("CLIENTS LIST");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, 32));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("CLIENTS LIST");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_ClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClientsMouseClicked

       int selectedRowIndex=jTable_Clients.getSelectedRow();
       //jTextField_Id.setText(jTable_Clients.getValueAt(selectedRowIndex, 0).toString());
        //jTextField_PropertyID.setText(jTable_Clients.getValueAt(selectedRowIndex, 1).toString());
       jTextField_ClientID.setText(jTable_Clients.getValueAt(selectedRowIndex, 0).toString());
       //jTextField_FinalPrice.setText(jTable_Clients.getValueAt(selectedRowIndex, 3).toString());
        
    }//GEN-LAST:event_jTable_ClientsMouseClicked

    private void jTextField_FinalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FinalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FinalPriceActionPerformed

    private void jTextField_ClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ClientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ClientIDActionPerformed

    private void jButton_addsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addsalesActionPerformed
       
// int id=Integer.valueOf(jTextField_Id.getText());
        try{
             int propertyId=Integer.valueOf(jTextField_PropertyID.getText());
         int clientId=Integer.valueOf(jTextField_ClientID.getText());
         String finalPrice=jTextField_FinalPrice.getText();
         SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
         String sellingDate=dateFormat.format(jDateChooser_SalesDate.getDate());
         
        P_Sales sales=new P_Sales(0,propertyId,clientId,finalPrice,sellingDate);
        
        if(new P_Sales().addNewSales(sales))
        {
                    JOptionPane.showMessageDialog(null,"A New Sale Has Been Created and Added","Add Sale",1);}
        else{
                    JOptionPane.showMessageDialog(null,"Sale Not Added","Add Sale",2);
                }
        }catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Select the PropertyId and ClientId","Add Sale Error",2);
        }
       
    }//GEN-LAST:event_jButton_addsalesActionPerformed

    private void jButton_removesalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removesalesActionPerformed
try{
        int id=Integer.valueOf(jTextField_Id.getText());
        
        if(new P_Sales().deleteSales(id))
        {
                    JOptionPane.showMessageDialog(null,"Sale Data Has Been Deleted","Delete Sale",1);}
        else{
                    JOptionPane.showMessageDialog(null,"Sale Not Deleted","Delete Sale",2);
                }
}catch (Exception ex)
{
    JOptionPane.showMessageDialog(null,"Select the SalesId","Dete Sale Error",2);
}
    }//GEN-LAST:event_jButton_removesalesActionPerformed

    private void jButton_editsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editsalesActionPerformed

      try{         
 int id=Integer.valueOf(jTextField_Id.getText());
         int propertyId=Integer.valueOf(jTextField_PropertyID.getText());
         int clientId=Integer.valueOf(jTextField_ClientID.getText());
         String finalPrice=jTextField_FinalPrice.getText();
         SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
         String sellingDate=dateFormat.format(jDateChooser_SalesDate.getDate());
         
        P_Sales sales=new P_Sales(id,propertyId,clientId,finalPrice,sellingDate);
        
        if(new P_Sales().editSales(sales))
        {
                    JOptionPane.showMessageDialog(null,"Sale Data Has Been Updated","Edit Sale",1);}
        else{
                    JOptionPane.showMessageDialog(null,"Sale Not Updated","Edit Sale",2);
                }
      }catch (Exception ex)
      {
           JOptionPane.showMessageDialog(null,"Select the SalesId,PropertyId and ClientId","Edit Sale Error",2);
      }
    }//GEN-LAST:event_jButton_editsalesActionPerformed

    private void jTextField_PropertyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PropertyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PropertyIDActionPerformed

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jTable_PropertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_PropertiesMouseClicked
         int selectedRowIndex=jTable_Properties.getSelectedRow();
        jTextField_Id.setText(jTable_Properties.getValueAt(selectedRowIndex, 0).toString());
        jTextField_PropertyID.setText(jTable_Properties.getValueAt(selectedRowIndex, 1).toString());
        jTextField_FinalPrice.setText(jTable_Properties.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_jTable_PropertiesMouseClicked

    private void jTable_SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SalesMouseClicked
        try {
            int selectedRowIndex=jTable_Sales.getSelectedRow();
            jTextField_Id.setText(jTable_Sales.getValueAt(selectedRowIndex, 0).toString());
            jTextField_PropertyID.setText(jTable_Sales.getValueAt(selectedRowIndex, 1).toString());
            jTextField_ClientID.setText(jTable_Sales.getValueAt(selectedRowIndex, 2).toString());
            jTextField_FinalPrice.setText(jTable_Sales.getValueAt(selectedRowIndex, 3).toString());
            
            Date salesDate=new SimpleDateFormat("yyyy-MM-dd").parse(jTable_Sales.getValueAt(selectedRowIndex,4).toString());
            jDateChooser_SalesDate.setDate(salesDate);
        } catch (ParseException ex) {
            Logger.getLogger(SALES_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable_SalesMouseClicked

    private void jButton_refreshSalesTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshSalesTableActionPerformed
        fillJTableSales();
    }//GEN-LAST:event_jButton_refreshSalesTableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextAreaReceipt.setText("***************************\n");
        jTextAreaReceipt.setText(jTextAreaReceipt.getText() +"*       REAL ESTATE RECEIPT     *\n");
        jTextAreaReceipt.setText(jTextAreaReceipt.getText() +"***************************\n");
        
        Date obj=new Date();
        String date=obj.toString();
        
        jTextAreaReceipt.setText(jTextAreaReceipt.getText()+"\n"+date+ "\n\n");
        jTextAreaReceipt.setText(jTextAreaReceipt.getText()+"PROPERTY ID:" +jTextField_Id.getText()+"\n\n");
        jTextAreaReceipt.setText(jTextAreaReceipt.getText()+"OWNER ID:"+jTextField_PropertyID.getText()+"\n\n");       
        jTextAreaReceipt.setText(jTextAreaReceipt.getText()+"CLIENT ID:"+jTextField_ClientID.getText()+"\n\n");
        jTextAreaReceipt.setText(jTextAreaReceipt.getText()+"PRICE ID:"+jTextField_FinalPrice.getText()+"\n\n");
        jTextAreaReceipt.setText(jTextAreaReceipt.getText()+"DATE:"+jDateChooser_SalesDate.getDate()+"\n\n");
        
        jTextAreaReceipt.setText(jTextAreaReceipt.getText() +"\n\n                                    Signature\n");
        
        jTextAreaReceipt.setText(jTextAreaReceipt.getText() +"***************************\n");
        jTextAreaReceipt.setText(jTextAreaReceipt.getText() +"///////////////////////////\n");
        jTextAreaReceipt.setText(jTextAreaReceipt.getText() +"***************************\n");
            
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SALES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALES_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_addsales;
    private javax.swing.JButton jButton_editsales;
    private javax.swing.JButton jButton_refreshSalesTable;
    private javax.swing.JButton jButton_removesales;
    private com.toedter.calendar.JDateChooser jDateChooser_SalesDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_title3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_Clients;
    private javax.swing.JTable jTable_Properties;
    private javax.swing.JTable jTable_Sales;
    private javax.swing.JTextArea jTextAreaReceipt;
    private javax.swing.JTextField jTextField_ClientID;
    private javax.swing.JTextField jTextField_FinalPrice;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_PropertyID;
    // End of variables declaration//GEN-END:variables
}
