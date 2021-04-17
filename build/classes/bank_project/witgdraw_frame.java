package bank_project;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.util.Date; 
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;



public class witgdraw_frame extends javax.swing.JDialog {

    public long amount=0;
    public long withdraw_mount=0;
    public long remain_amount=0;
    public witgdraw_frame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    
    }

     public void date() {    
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    this.date_field.setText(formatter.format(date));
    //System.out.println(formatter.format(date));   
  }  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        total_amount_field = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        account_field = new javax.swing.JTextField();
        withdraw_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        withdraw_amount_field = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        remaining_amount_field = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        date_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(200, 20));
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Withdraw Amount Details");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(230, 10, 240, 25);

        total_amount_field.setEditable(false);
        total_amount_field.setText("0");
        total_amount_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(total_amount_field);
        total_amount_field.setBounds(190, 130, 340, 40);

        jLabel14.setText("Account Number");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(80, 60, 110, 40);

        jLabel15.setText("Total Amount");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(80, 130, 100, 40);

        account_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        account_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                account_fieldKeyTyped(evt);
            }
        });
        jPanel3.add(account_field);
        account_field.setBounds(190, 60, 340, 40);

        withdraw_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/deposit (1).png"))); // NOI18N
        withdraw_btn.setText("Withdraw");
        withdraw_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        withdraw_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_btnActionPerformed(evt);
            }
        });
        jPanel3.add(withdraw_btn);
        withdraw_btn.setBounds(230, 370, 100, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/cancel-icon.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(370, 370, 100, 30);

        jLabel16.setText("Withdrwa Amount");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(80, 200, 110, 40);

        withdraw_amount_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        withdraw_amount_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                withdraw_amount_fieldKeyTyped(evt);
            }
        });
        jPanel3.add(withdraw_amount_field);
        withdraw_amount_field.setBounds(190, 200, 340, 40);

        jLabel17.setText("Remaining Amount");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(80, 270, 110, 40);

        remaining_amount_field.setEditable(false);
        remaining_amount_field.setText("0");
        remaining_amount_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(remaining_amount_field);
        remaining_amount_field.setBounds(190, 270, 340, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(80, 30, 690, 450);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 880, 510);

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void withdraw_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_btnActionPerformed

        String account_no=this.account_field.getText();
        remain_amount=Long.parseLong(remaining_amount_field.getText());
        
        if(account_no.isEmpty()|| remain_amount==0){
        JOptionPane.showMessageDialog(null,"Please enter account number and withdraw amount for transection....?");
        }else{
            int  option= JOptionPane.showConfirmDialog(null,"Do you want to withdraw: "+withdraw_amount_field.getText()+" amount..");
            if(option==0){
                date();
                String date=this.date_field.getText();
                //JOptionPane.showMessageDialog(null, date);
        int row=database.with_draw(account_no, remain_amount,date);
        if(row>0){
            
          JOptionPane.showMessageDialog(null,"You have withdraw : "+withdraw_amount_field.getText()+" amount...");
       this.hide();
      // new Main_Frame().show();
        }else{
            JOptionPane.showMessageDialog(null,"error");
        }
        
            }else{
             JOptionPane.showMessageDialog(null,"transection has been canceled");
            }
        }
        
    }//GEN-LAST:event_withdraw_btnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int option=JOptionPane.showConfirmDialog(null,"Do you want to cancelled this trasection...?");
        if(option==0){
        this.hide();
        //new Main_Frame().show();
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void account_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_account_fieldKeyTyped
       
        
        String account_no=this.account_field.getText();
       
        try{
        amount=database.check_account(account_no);
        this.total_amount_field.setText(""+amount);
        }catch(Exception e){
            
        } 
        
       
    }//GEN-LAST:event_account_fieldKeyTyped

    private void withdraw_amount_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdraw_amount_fieldKeyTyped
        
        try{
        withdraw_mount=Long.parseLong(withdraw_amount_field.getText());
        remain_amount=(amount-withdraw_mount);
        remaining_amount_field.setText(""+remain_amount);
        }catch(Exception e){
            
        }
        
        
    }//GEN-LAST:event_withdraw_amount_fieldKeyTyped

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
            java.util.logging.Logger.getLogger(witgdraw_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(witgdraw_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(witgdraw_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(witgdraw_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                witgdraw_frame dialog = new witgdraw_frame(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField account_field;
    private javax.swing.JTextField date_field;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField remaining_amount_field;
    private javax.swing.JTextField total_amount_field;
    private javax.swing.JTextField withdraw_amount_field;
    private javax.swing.JButton withdraw_btn;
    // End of variables declaration//GEN-END:variables
}
