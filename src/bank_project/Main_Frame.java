package bank_project;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Main_Frame extends javax.swing.JFrame {

    
    public Main_Frame() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        create_account_btn = new javax.swing.JButton();
        deposit_btn = new javax.swing.JButton();
        withdraw_btn = new javax.swing.JButton();
        account_detail_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        customer_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 10));
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/bank_logo.png"))); // NOI18N
        jLabel1.setText("         Banking Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1073, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 220);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/author-icon.png"))); // NOI18N
        jButton1.setText("Create Account");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(650, 220, 240, 210);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/deposit (3).png"))); // NOI18N
        jButton2.setText("Deposit Amount");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(940, 220, 250, 210);

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        create_account_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        create_account_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/Add-icon.png"))); // NOI18N
        create_account_btn.setText("Create New Account");
        create_account_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        create_account_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_account_btnActionPerformed(evt);
            }
        });

        deposit_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deposit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/deposit (1).png"))); // NOI18N
        deposit_btn.setText("Deposit Amount");
        deposit_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deposit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btnActionPerformed(evt);
            }
        });

        withdraw_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdraw_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/update_icon.png"))); // NOI18N
        withdraw_btn.setText("Withdrwa Amount");
        withdraw_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        withdraw_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_btnActionPerformed(evt);
            }
        });

        account_detail_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        account_detail_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/delete_icon.png"))); // NOI18N
        account_detail_btn.setText("Account Details");
        account_detail_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        account_detail_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_detail_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(create_account_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
            .addComponent(deposit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(withdraw_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(account_detail_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(create_account_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deposit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(withdraw_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(account_detail_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(664, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 70, 370, 990);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/withdrawal.png"))); // NOI18N
        jButton3.setText("Withdraw Amount");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(1230, 220, 250, 210);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 102));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/management.png"))); // NOI18N
        jButton8.setText("Accounts Detail");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(650, 480, 240, 210);

        customer_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customer_btn.setForeground(new java.awt.Color(0, 0, 102));
        customer_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/team.png"))); // NOI18N
        customer_btn.setText("Customers");
        customer_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customer_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        customer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_btnActionPerformed(evt);
            }
        });
        jPanel2.add(customer_btn);
        customer_btn.setBounds(940, 480, 250, 210);

        cancel_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancel_btn.setForeground(new java.awt.Color(0, 0, 102));
        cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/reports-icon.png"))); // NOI18N
        cancel_btn.setText("Report");
        cancel_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        jPanel2.add(cancel_btn);
        cancel_btn.setBounds(1230, 480, 250, 210);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 150, 1950, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // this.hide();
        new Create_Account(this, rootPaneCheckingEnabled).setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //this.hide();
        new Deposit_Frame(this, rootPaneCheckingEnabled).setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
       // this.hide();
        new witgdraw_frame(this, rootPaneCheckingEnabled).setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
       // this.hide();
        new Display_Frame(this, rootPaneCheckingEnabled).show();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void customer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_btnActionPerformed
        
        try {
            new customers_detail(this, rootPaneCheckingEnabled).show();
        } catch (SQLException ex) {
            Logger.getLogger(Main_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_customer_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed

        new report_frame(this, rootPaneCheckingEnabled).show();

    }//GEN-LAST:event_cancel_btnActionPerformed

    private void create_account_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_account_btnActionPerformed
        
        new Create_Account(null, rootPaneCheckingEnabled).show();
        
    }//GEN-LAST:event_create_account_btnActionPerformed

    private void deposit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btnActionPerformed
        
        new Deposit_Frame(null, rootPaneCheckingEnabled).show();
        
    }//GEN-LAST:event_deposit_btnActionPerformed

    private void withdraw_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_btnActionPerformed
        
        new witgdraw_frame(null, rootPaneCheckingEnabled).show();
        
    }//GEN-LAST:event_withdraw_btnActionPerformed

    private void account_detail_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_detail_btnActionPerformed
        
        new Display_Frame(null, rootPaneCheckingEnabled).show();
        
    }//GEN-LAST:event_account_detail_btnActionPerformed

    
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
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account_detail_btn;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton create_account_btn;
    private javax.swing.JButton customer_btn;
    private javax.swing.JButton deposit_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton withdraw_btn;
    // End of variables declaration//GEN-END:variables
}
