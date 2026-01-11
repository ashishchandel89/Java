import java.util.*;
import java.sql.*;

class c1{
    int id;
    long phone;
    String name, email;
    Connection con;
    public c1(){
    try{
           Class.forName("com.mysql.cj.jdbc.Driver");        
           con=DriverManager.getConnection("jdbc:mysql://localhost/Employee","root","");
           if (con != null) {
            System.out.println("Database connected successfully!");
        } else {
            System.out.println("Connection is null!");
        }

        }catch(Exception ex){
        System.out.println("Error is: "+ex);
        }
        }
        
        public void Emp_Details(){

        System.out.print("Enter Employee ID: ");
        Scanner obj=new Scanner(System.in);
         id=obj.nextInt();
         obj.nextLine();

          System.out.print("Enter Employee Name: ");
         name=obj.nextLine();

          System.out.print("Enter Employee Email Id: ");
         email=obj.nextLine();

          System.out.print("Enter Employee Phone No: ");
         phone=obj.nextLong();
        
        
            System.out.println(" All Details are Saved Sucessfully !!!");
            try{
            Statement stmt;
            String s1="insert into Emp_Table values("+id+" ,'"+name+"' ,'"+email+"','"+phone+"')";
            stmt=con.createStatement();
            stmt.executeUpdate(s1);
            }catch(Exception e){
                System.out.println("Error is:"+e);
            }
        }
        public void Exit(){
        System.exit(0);
        }  

       
}



public class sql1 {
    public static void main(String [] args){
        try{
        
        System.out.println("1. Enter Employee Details");
        
        System.out.println("0. Exit");

        System.out.print("Enter Your Choice: ");
        Scanner obj=new Scanner(System.in);
        int c=obj.nextInt();

        c1 obj2=new c1();
       

        while(true){
            if(c==1){
                obj2.Emp_Details();
            }
           
            else if(c==0){
                obj2.Exit();
            }
            break;
        }
        
    }catch(Exception ev){
        System.out.println("Error is: "+ev);
    }
    }
    
    
}
 
