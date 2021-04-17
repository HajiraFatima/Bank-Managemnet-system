package bank_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class database {

        
    public static ResultSet rs;
    public static Statement st;
    public static Connection conn;
    
    



 static {
 
           try {  
            Class.forName("com.mysql.jdbc.Driver");  
            conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bank","root",""); 
                 st=conn.createStatement();
            
            System.out.println("Connection Created....!");
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Connection failed....!");
            
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            }
    
}// static end
 

// get_account number as a unique key
 public static int get_account_no(){
            int account_no=0;
        try {
            String query="SELECT *FROM create_account";
            rs=st.executeQuery(query);
            while(rs.next()){
                account_no=rs.getInt("user_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
            return account_no;
 }
 
//  create account 
 public static int create_account(String first_name, String last_name,String cnic,String father_name, String email, String mobile,
         String address,String account_type,String account_no){
         int row=0;     
        try {

        String query="INSERT INTO create_account(first_name,last_name,cnic_no,father_name,email,mobile,address,account_type,account_no)VALUES('"+first_name+"','"+last_name+"','"+cnic+"','"+father_name+"',"
        + "     '"+email+"','"+mobile+"','"+address+"','"+account_type+"','"+account_no+"' )";
        row=st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
 } // end create account
 
 public static boolean already_account(String email,String cnic){
     boolean bol=false;
   try {
       int row;
            String query="SELECT *FROM create_account WHERE cnic_no='"+cnic+"' AND "+ "email='"+email+"'";
            rs=st.executeQuery(query);
            while(rs.next()){
                bol=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bol;
           
 }
 
 public static Vector display_record(String account_no, String password){
  boolean bol=false;
  Vector vob=new Vector();
     try {
            String query="SELECT  *from create_account WHERE account_no='"+account_no+"' AND password='"+password+"'";
            rs=st.executeQuery(query);
           while(rs.next()){
               //bol=true;
               display_set_get ob=new display_set_get();
               ob.setAcount_no(rs.getString("account_no"));
               ob.setFull_name(rs.getString("first_name"));
               ob.setCnic(rs.getString("cnic_no"));
               ob.setAmount(rs.getLong("amount"));
               vob.add(ob);
           }        
               
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vob;
 }
 
 public static long check_account(String account){
       long amount=0;      
     
     if(account.isEmpty()){
         
     }else{
     try {
            String query="SELECT *FROM create_account WHERE account_no='"+account+"'";
            rs=st.executeQuery(query);
            while(rs.next()){
            amount=rs.getLong("amount");
               }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
        return amount;
 }
 public static int deposit_amount(String account, long amount,String date){
     int row=0;
     
     try{
         
         String query="UPDATE create_account SET amount="+amount+" where account_no='"+account+"'";
         row=st.executeUpdate(query);
            query="insert into deposit(account_type,amount,get_date)values('"+account+"',"+amount+",'"+date+"')";
            st.executeUpdate(query);
     
     }
     catch(SQLException ex){
           Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
         
     }
     return row;
             
 }
  
 public static int with_draw(String account, long amount,String date){
     int row=0;
            
        try {
            
            String query="update create_account set amount='"+amount+"' where account_no='"+account+"'";
            row=st.executeUpdate(query);
            query="insert into withdraw (account_type,amount,get_date)values('"+account+"',"+amount+",'"+date+"')";
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return row;
        
 }

 
 
 public static boolean check_account_deposit(String account){
   boolean bol=false;
     
     if(account.isEmpty()){
         
     }else{
     try {
            String query="SELECT *FROM create_account WHERE account_no='"+account+"'";
            rs=st.executeQuery(query);
            while(rs.next()){
            bol=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
        return bol;
 }
 
 
 public static  boolean login_user(String email,String pas){
      boolean bol=false;
              
     try {
           
            String query="select * from bank_user where user_email='"+email+"' and user_pasword='"+pas+"'";
            rs=st.executeQuery(query);
            while(rs.next()){
                bol=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bol;
            
 }
        
 
}// end class