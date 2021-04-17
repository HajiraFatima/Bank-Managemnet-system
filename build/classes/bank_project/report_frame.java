
package bank_project;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class report_frame extends javax.swing.JDialog {

    public report_frame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        withdraw_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        account_no_field = new javax.swing.JTextField();
        transection_type_comobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(220, 30));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Reports of Customer");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(280, 0, 190, 25);

        withdraw_btn.setBackground(new java.awt.Color(0, 51, 102));
        withdraw_btn.setForeground(new java.awt.Color(255, 255, 255));
        withdraw_btn.setText("Okay");
        withdraw_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_btnActionPerformed(evt);
            }
        });
        jPanel3.add(withdraw_btn);
        withdraw_btn.setBounds(350, 440, 80, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/search-icon.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(530, 80, 100, 30);

        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR", "Account no", "amount", "date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customer_table);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 130, 860, 300);
        jPanel3.add(account_no_field);
        account_no_field.setBounds(250, 40, 250, 30);

        transection_type_comobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "withdraw", "deposit" }));
        jPanel3.add(transection_type_comobox);
        transection_type_comobox.setBounds(250, 80, 250, 30);

        jLabel3.setText("Account No");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(150, 44, 80, 20);

        jLabel4.setText("Transection Type");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(150, 80, 90, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 860, 480);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 860, 480);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/bank_logo.png"))); // NOI18N
        jLabel1.setText("Private Banking Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdraw_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_btnActionPerformed

        this.hide();
        // new Main_Frame().show();

    }//GEN-LAST:event_withdraw_btnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String account_no=this.account_no_field.getText();
       String transection=(String)this.transection_type_comobox.getSelectedItem();
       // JOptionPane.showMessageDialog(null, transection);
            int sr=1;
        long amount=0;
    DefaultTableModel model = (DefaultTableModel) customer_table.getModel();
    String query="SELECT *FROM "+transection+" where account_type='"+account_no+"'";
    try {
            database.rs=database.st.executeQuery(query);
            
            while(database.rs.next()){
                          
                Object[] row = {sr,database.rs.getString("account_type"),database.rs.getLong("amount"),database.rs.getString("get_date")};
                model.addRow(row);
              sr++;
          }
        
        } catch (SQLException ex) {
            Logger.getLogger(customers_detail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(report_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                report_frame dialog = new report_frame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_no_field;
    private javax.swing.JTable customer_table;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> transection_type_comobox;
    private javax.swing.JButton withdraw_btn;
    // End of variables declaration//GEN-END:variables
}
