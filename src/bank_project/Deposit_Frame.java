

package bank_project;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class Deposit_Frame extends javax.swing.JDialog {


    public Deposit_Frame(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        date_field = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        amount_field = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        account_field = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Deposit Amount Details");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(230, 10, 220, 25);

        amount_field.setBackground(new java.awt.Color(153, 204, 255));
        amount_field.setText("0");
        amount_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(amount_field);
        amount_field.setBounds(190, 130, 340, 40);

        jLabel14.setText("Account Number");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(80, 60, 110, 40);

        jLabel15.setText("Enter Amount");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(100, 130, 90, 40);

        account_field.setBackground(new java.awt.Color(153, 204, 255));
        account_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(account_field);
        account_field.setBounds(190, 60, 340, 40);

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/deposit (1).png"))); // NOI18N
        jButton2.setText("Deposit");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(250, 220, 90, 30);

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/cancel-icon.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(370, 220, 90, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(80, 30, 690, 340);

        jProgressBar1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.add(jProgressBar1);
        jProgressBar1.setBounds(220, 390, 220, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 880, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String account_no=this.account_field.getText();
        long amount =Integer.parseInt(this.amount_field.getText());
        
        if(account_no.isEmpty() || amount==0){
        JOptionPane.showMessageDialog(null,"Please enter account correct account number and amount....!");
        }else{
          
        boolean bol=database.check_account_deposit(account_no);
        if(bol){
            
        long net_amount=database.check_account(account_no);
         net_amount+=amount;
     int option=  JOptionPane.showConfirmDialog(null,"Do you want to Deposit: "+amount+" ");
    if(option==0){
        date();
    String date=this.date_field.getText();
     int row=database.deposit_amount(account_no,net_amount,date); 
      
     if(row>0){
        JOptionPane.showMessageDialog(null,"you have deposited amount: "+amount+" ....!");
        this.hide();
        //new Main_Frame().show();
        
        }else{
          JOptionPane.showMessageDialog(null,"error accured.....!");
        }
    }else{
        JOptionPane.showMessageDialog(null,"Transection has been cancelled.....!");
    }
        }else{
           JOptionPane.showMessageDialog(null,"Sorry you have entered wrong acoount number.....");
       }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        int option=JOptionPane.showConfirmDialog(null,"Do you want to cancelled transection....?");
        if(option==0){
        this.hide();
        //new Main_Frame().show();
            
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
            java.util.logging.Logger.getLogger(Deposit_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Deposit_Frame dialog = new Deposit_Frame(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField amount_field;
    private javax.swing.JTextField date_field;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
