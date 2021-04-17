package bank_project;

import javax.swing.JOptionPane;

public class Create_Account extends javax.swing.JDialog {

    public Create_Account(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
   get_account();
    }
  
    // get account no from database as a user_id
    public void get_account(){
       int account_no=database.get_account_no();
       this.account_no_label.setText("CS00"+account_no);
    }
    
    public void data(){
    
        this.first_name_field.setText("hello");
        this.last_name_field.setText("");
        this.father_field.setText("");
        this.cnic_field.setText("");
        this.email_field.setText("");
        this.address_field.setText("");
        this.mobile_field.setText("");
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        last_name_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        first_name_field = new javax.swing.JTextField();
        father_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cnic_field = new javax.swing.JTextField();
        mobile_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        address_field = new javax.swing.JTextField();
        account_type_comobox = new javax.swing.JComboBox<>();
        create_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        account_no_label = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel5.setText("jLabel5");

        jTextField7.setBackground(new java.awt.Color(153, 204, 255));
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setText("Full Name");

        jLabel11.setText("Last Name");

        jTextField8.setBackground(new java.awt.Color(153, 204, 255));
        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(200, 20));
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/bank_logo.png"))); // NOI18N
        jLabel1.setText(" Banking Management System");

        jTextField12.setBackground(new java.awt.Color(0, 51, 153));
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("New Registration Details");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(jLabel2);
        jLabel2.setBounds(270, 0, 230, 25);

        last_name_field.setBackground(new java.awt.Color(153, 204, 255));
        last_name_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(last_name_field);
        last_name_field.setBounds(420, 70, 230, 30);

        jLabel3.setText("First Name");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 70, 70, 20);

        jLabel4.setText("Last Name");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(350, 70, 70, 30);

        first_name_field.setBackground(new java.awt.Color(153, 204, 255));
        first_name_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(first_name_field);
        first_name_field.setBounds(140, 70, 200, 30);

        father_field.setBackground(new java.awt.Color(153, 204, 255));
        father_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(father_field);
        father_field.setBounds(420, 120, 230, 30);

        jLabel6.setText("CNIC No");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(60, 120, 70, 30);

        jLabel7.setText("Father Name");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(350, 120, 70, 30);

        cnic_field.setBackground(new java.awt.Color(153, 204, 255));
        cnic_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(cnic_field);
        cnic_field.setBounds(140, 120, 200, 30);

        mobile_field.setBackground(new java.awt.Color(153, 204, 255));
        mobile_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(mobile_field);
        mobile_field.setBounds(420, 170, 230, 30);

        jLabel8.setText("Email No");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(60, 170, 70, 30);

        jLabel9.setText("Mobile No");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(350, 170, 60, 30);

        email_field.setBackground(new java.awt.Color(153, 204, 255));
        email_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(email_field);
        email_field.setBounds(140, 170, 200, 30);

        jLabel12.setText("Address");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(60, 220, 70, 30);

        jLabel13.setText("Account Type");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(340, 220, 80, 30);

        address_field.setBackground(new java.awt.Color(153, 204, 255));
        address_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(address_field);
        address_field.setBounds(140, 220, 200, 30);

        account_type_comobox.setBackground(new java.awt.Color(153, 204, 255));
        account_type_comobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "current", "saving" }));
        account_type_comobox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(account_type_comobox);
        account_type_comobox.setBounds(420, 220, 230, 30);

        create_btn.setBackground(new java.awt.Color(0, 51, 102));
        create_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/Add-icon.png"))); // NOI18N
        create_btn.setText("Create");
        create_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btnActionPerformed(evt);
            }
        });
        jPanel3.add(create_btn);
        create_btn.setBounds(260, 290, 100, 30);

        cancel_btn.setBackground(new java.awt.Color(0, 51, 102));
        cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank_project/icon/cancel-icon.png"))); // NOI18N
        cancel_btn.setText("Cancel");
        cancel_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        jPanel3.add(cancel_btn);
        cancel_btn.setBounds(370, 290, 100, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Account No:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 20, 90, 30);

        account_no_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(account_no_label);
        account_no_label.setBounds(100, 14, 140, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(70, 10, 740, 440);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 880, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        this.hide();
        //new Main_Frame().show();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void create_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_btnActionPerformed
        
        
        
       String first_name=first_name_field.getText();
       String last_name=last_name_field.getText();
       String cnic=cnic_field.getText();
       String father_name=father_field.getText();
       String email=email_field.getText();
       String mobile=mobile_field.getText();
       String address=address_field.getText();
       String account_no=account_no_label.getText();
       String account_type=(String) this.account_type_comobox.getSelectedItem();
       if(first_name.isEmpty() || last_name.isEmpty() || email.isEmpty() || cnic.isEmpty() || father_name.isEmpty()|| mobile.isEmpty()){
       JOptionPane.showMessageDialog(null,"Please enter all fields for creating account......!");
       }else{
       boolean bol=database.already_account(email, cnic);
       if(bol){
        JOptionPane.showMessageDialog(null,"Your Account already created with same Email and CNIC no ......!");
        data();
       }else{
       
           int row=database.create_account(first_name, last_name, cnic, father_name, email, mobile, address,account_type,account_no);
           
           if(row>0){
        JOptionPane.showMessageDialog(null,"Your Account has been Created Successfully......!");
        this.hide();
        //new Main_Frame().show();
           }else{
        JOptionPane.showMessageDialog(null,"error...?");
               
           }
       }
       }
    }//GEN-LAST:event_create_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Create_Account dialog = new Create_Account(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel account_no_label;
    private javax.swing.JComboBox<String> account_type_comobox;
    private javax.swing.JTextField address_field;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JTextField cnic_field;
    private javax.swing.JButton create_btn;
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField father_field;
    private javax.swing.JTextField first_name_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField last_name_field;
    private javax.swing.JTextField mobile_field;
    // End of variables declaration//GEN-END:variables
}
