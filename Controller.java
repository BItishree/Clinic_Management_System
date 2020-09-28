/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicmanagementsystem;

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.math.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class Controller {
    
   
   public Connection getConnection()throws Exception{

       String driverClass="org.apache.derby.jdbc.ClientDriver";
         Class.forName(driverClass);
         String url="jdbc:derby://localhost:1527/ClinicManagementSystem";
         String userName="tushar333";
         String password="p1s0w6r4";
        Connection con=DriverManager.getConnection(url,userName,password);
        return con;   
       }
    public boolean isLogin( String category,String user_name,String password)  throws Exception
    {
     
          boolean islogin=false;
          Connection con=getConnection();
          Statement st=con.createStatement(); 
       String sql="select * from USERTABLE";
       ResultSet rs=st.executeQuery(sql);
       while(rs.next())
       {
          if(rs.getString("CATEGORY").equalsIgnoreCase(category)){
       if((rs.getString("Name").equals(user_name) && rs.getString("Password").equals(password)))
       {
               islogin=true;
               break;
       }
     
       }
       
       
       
    }
    return islogin;
    }
    
    public boolean addPatient(Patient p) throws Exception
    {
        boolean isSuccess=false;
         Connection con=getConnection();
       Statement st=con.createStatement();
       int id=(int)(1000*Math.random());
        String name=p.getName();
       
        String gender=p.getGender();
        int age=p.getAge();
        String mobileno=p.getMobileNo();
        String address=p.getAddress();
         
       String sql="insert into PATIENT values("+id+",'"+name+"','"+gender+"',"+age+",'"+mobileno+"','"+address+"')";
         int i=st.executeUpdate(sql);
       if(i>0)
       {
         
          isSuccess=true;
          JOptionPane.showMessageDialog(null,"submitted successfully"+"\n Patient Unique_Id is:"+id);
        
       }
     
      return isSuccess; 
    }
    public void vistPatient(int id) throws Exception{
         
         Connection con=getConnection();
          Statement st=con.createStatement(); 
      
        
       String sql="Select Name from PATIENT Where Id=?";
        PreparedStatement pst=con.prepareStatement(sql);
         pst.setInt(1,id);
         ResultSet rs=pst.executeQuery();
          LocalDate t=LocalDate.now();
               int record_id=(int)(10000*Math.random());                     
          String date=t.toString();
          Statement st1=con.createStatement();
         if(rs.next()){
             
              String sql2="insert into TREATMENTDETAILS values("+id+","+record_id+",'"+date+"','"+null+"',"+0.0+","+0.0+")";
       int i=st1.executeUpdate(sql2);
         if(i>0)
       {
       
          JOptionPane.showMessageDialog(null,"Patient Found"+"\nPatient Name:"+rs.getString("Name")+"\n Patient record_Id is:"+record_id);
        
       }
              
                  }
         else{
             JOptionPane.showMessageDialog(null,"Patient Not Found");
         }
         
       
    }
    public void addTreatmentDetails(int record_id,String reason,double fees)throws Exception{
         Connection con=getConnection();
         String sql="Update TREATMENTDETAILS set TREATMENT_REASON=?,TREATMENT_FEES=? Where record_Id=?";
         PreparedStatement pst=con.prepareStatement(sql);
         pst.setString(1,reason);
         pst.setDouble(2, fees);
           pst.setInt(3,record_id);
           int i=pst.executeUpdate();
           if(i>0){
                 JOptionPane.showMessageDialog(null,"Submit Successful");
           }
     
    }
    public double payment(int id,int record_id)throws Exception{
        Connection con=getConnection();
        double treatment_fees=0.0;
         String sql="Select TREATMENT_FEES from TREATMENTDETAILS where id=? and record_id=?";
         PreparedStatement pst=con.prepareStatement(sql);
         pst.setInt(1,id);

           pst.setInt(2,record_id);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
              
                treatment_fees= rs.getDouble("TREATMENT_FEES");
            }
      return  treatment_fees; 
    }
    public void makePayment(int record_id,double total_payment)throws Exception{
        Connection con=getConnection();
      
          String sql="Update TREATMENTDETAILS set TOTAL_PAYMENT=? Where record_Id=?";
         PreparedStatement pst=con.prepareStatement(sql);
         pst.setDouble(1,total_payment);
         pst.setInt(2,record_id);
         int i= pst.executeUpdate();
             if(i>0)
       {
       
          JOptionPane.showMessageDialog(null,"Payment Successful");
        
       }
    }
      public Patient getPatient(int id)throws Exception{
         Connection con=getConnection();
          Statement st=con.createStatement(); 
      
        Patient p=null;
      
       String sql="Select * from PATIENT Where Id=?";
        PreparedStatement pst=con.prepareStatement(sql);
        
         pst.setInt(1,id);
         ResultSet rs=pst.executeQuery();
         if(rs.next()){
             p=new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6));
              

               
         }
         return p;
      }
  public TreatmentDetails getTreatmentDetails(int record_id)throws Exception{
  Connection con=getConnection();
          Statement st=con.createStatement();
  TreatmentDetails t=null;
  String sql="Select * from TREATMENTDETAILS Where record_Id=?";
        PreparedStatement pst=con.prepareStatement(sql);
        
         pst.setInt(1,record_id);
         ResultSet rs=pst.executeQuery();
         if(rs.next()){
             t=new TreatmentDetails(rs.getInt(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getDouble(6));
              

               
         }
  return t;
  }
public ArrayList<TreatmentDetails> getSearchTreatmentDetails(int id) throws Exception
  {
       ArrayList<TreatmentDetails> al=new ArrayList<>();
       Connection con=getConnection(); String sql="Select * from TREATMENTDETAILS Where id=?";
        PreparedStatement pst=con.prepareStatement(sql);
         TreatmentDetails t=null;
         pst.setInt(1,id);
         ResultSet rs=pst.executeQuery();
         while(rs.next()){
             t=new TreatmentDetails(rs.getInt(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getDouble(6));
              al.add(t);

         }    
       
      return al;
  
  }
public void ageUpdate(int age,int id){
     
       try {
           Connection con=getConnection();
           String sql="Update PATIENT set AGE=? Where Id=?";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setInt(1,age);
           
           pst.setInt(2,id);
           int i=pst.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null,"Update Successful");
           }
       } catch (Exception ex) {
           Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
       }
       
}
public void addressUpdate(String address,int id){
      
       try {
           Connection con=getConnection();
           String sql="Update PATIENT set ADDRESS=? Where Id=?";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1,address);
           
           pst.setInt(2,id);
           int i=pst.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null,"Update Successful");
           }
       } catch (Exception ex) {
           Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
       }
     
    
}
public void mobUpdate(String mobNo,int id){
  
       try {
           Connection con=getConnection();
           String sql="Update PATIENT set MOBILENO=? Where Id=?";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1,mobNo);
           
           pst.setInt(2,id);
           int i=pst.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null,"Update Successful");
           }
       } catch (Exception ex) {
           Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    
}
}
    
    
