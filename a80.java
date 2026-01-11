import javax.swing.*;
import java.awt.*;
import java.awt.Taskbar.State;
import java.sql.*;
import java.util.*;

class c1 extends JFrame{
    JTable jt1;
    String name1,rollno,address,phone;
    Connection con;
     Statement stmt;
   
    String col[]=new String[]{"Roll No","Name","Address","Phone"};
  //  DefaultTableModel model = new DefaultTableModel(col, 0);

    public c1(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/data2","root","");
            stmt=con.createStatement();
            

                    setSize(2200,1000);
                    setLayout(null);
                    getContentPane().setBackground(Color.BLACK);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   


     ResultSet rs2=stmt.executeQuery("Select * from student2");
            int j=0;
            while(rs2.next()){
                j++;
            }

  Object row[][]=new Object[j][4];
  
            ResultSet rs=stmt.executeQuery("Select * from student2");
            int i=0;
            while(rs.next()){

                row[i][0]=rs.getString(1);
                row[i][1]=rs.getString(2);
                row[i][2]=rs.getString(3);
                row[i][3]=rs.getString(4);
                
                i++;
            }

        jt1=new JTable(row,col);
        JScrollPane obj=new JScrollPane(jt1);
        obj.setBounds(20, 20, 1000, 400);
       
        add(obj);
       

        }
        catch(Exception e){
            System.out.println("Error"+e);
        }
        
        
        setVisible(true);
    }
}
public class a80{
    public static void main(String [] args){
        c1 obj=new c1();
    }
}