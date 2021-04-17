/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_project;

import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anees brohi
 */
public class Display_Frame extends javax.swing.JDialog {

    /**
     * Creates new form Display_Frame
     */
    public Display_Frame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    public void clear_data(){
                this.account_number_field.setText("");
                this.name_label.setText("");
                this.cnic_label.setText("");
                this.total_amount_label.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        account_number_field = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        cnic_label = new javax.swing.JLabel();
        total_amount_label = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(200, 20));
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/bank_logo.png"))); // NOI18N
        jLabel1.setText(" Banking Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Display Account Details");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(230, 10, 220, 25);

        jLabel14.setText("Account Number");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(90, 60, 100, 40);

        account_number_field.setBackground(new java.awt.Color(153, 204, 255));
        account_number_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(account_number_field);
        account_number_field.setBounds(190, 60, 340, 40);

        submit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/search-icon.png"))); // NOI18N
        submit_btn.setText("check");
        submit_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        jPanel3.add(submit_btn);
        submit_btn.setBounds(320, 120, 90, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Total Amount: ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(90, 290, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Full Name: ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(90, 200, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CNIC No: ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(90, 250, 110, 30);

        name_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(name_label);
        name_label.setBounds(250, 200, 300, 30);

        cnic_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(cnic_label);
        cnic_label.setBounds(250, 250, 300, 30);

        total_amount_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(total_amount_label);
        total_amount_label.setBounds(250, 290, 300, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/cancel-icon.png"))); // NOI18N
        jButton3.setText("Okay");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(590, 400, 80, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(90, 30, 690, 440);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 880, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed

        boolean bol=false;
        try {
            String account_no=account_number_field.getText();
            
            String query="Select *from create_account where account_no='"+account_no+"'";
            database.rs=database.st.executeQuery(query);
            while(database.rs.next()){
                bol=true;
                this.name_label.setText(database.rs.getString("first_name"));
                this.cnic_label.setText(database.rs.getString("cnic_no"));
                this.total_amount_label.setText(""+database.rs.getLong("amount"));
            }
            
            if(!bol){
                JOptionPane.showMessageDialog(null,"Sorry Account number not matched....!");
            clear_data();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Display_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_submit_btnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int option=JOptionPane.showConfirmDialog(null,"Do you want to cancel ?");
               if(option==0){
               this.hide();
              // new Main_Frame().show();
               }    else{
               clear_data();    
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
            java.util.logging.Logger.getLogger(Display_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Display_Frame dialog = new Display_Frame(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField account_number_field;
    private javax.swing.JLabel cnic_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton submit_btn;
    private javax.swing.JLabel total_amount_label;
    // End of variables declaration//GEN-END:variables
}
