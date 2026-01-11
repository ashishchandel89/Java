
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


 
class a79 extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2,b3,b4,b5;
     Connection con1;
     JTable jt1;
    Statement stmt;
    

    



    public a79(){
   
         try{
           

            Class.forName("com.mysql.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/data2","root","");
             stmt = con1.createStatement(); 
        
           //Class.forName("com.mysql.cj.jdbc.Driver");         // driver ek software hai jo ki java application and my sql ke bich connection create krta hai.
           //con1=DriverManager.getConnection("jdbc:mysql://localhost/data2","root","");
   
        setSize(2200,1000);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);            // any color can be choose with this text {Color.decode("#738933");}

         l1=new JLabel("FORM");
         l1.setBounds(750,60,300,65);
          l1.setFont(new Font("GEORGIA", Font.BOLD,45));
         l1.setForeground(Color.WHITE);

         
         l2=new JLabel("Name:");
         l2.setBounds(610,200,300,45);
          l2.setFont(new Font("GEORGIA", Font.BOLD,30));
         l2.setForeground(Color.WHITE);

          //name
           t1=new JTextField("");
        t1.setBounds(800,200,300,40);
        t1.setFont(new Font("Arial",Font.BOLD,20));
        t1.setForeground(Color.WHITE);
        t1.setBackground(Color.BLACK);

        l3=new JLabel("Roll No:");
         l3.setBounds(610,300,300,45);
          l3.setFont(new Font("GEORGIA", Font.BOLD,30));
         l3.setForeground(Color.WHITE);

          //roll no
            t2=new JTextField("");
            t2.setBounds(800,300,300,40);
              t2.setFont(new Font("Arial",Font.BOLD,20));
              t2.setForeground(Color.WHITE);
            t2.setBackground(Color.BLACK);

            l4=new JLabel("Phone No:");
         l4.setBounds(610,400,300,45);
          l4.setFont(new Font("GEORGIA", Font.BOLD,30));
         l4.setForeground(Color.WHITE);

          //phone no
          t3=new JTextField("");
            t3.setBounds(800,400,300,40);
              t3.setFont(new Font("Arial",Font.BOLD,20));
              t3.setForeground(Color.WHITE);
            t3.setBackground(Color.BLACK);

        l5=new JLabel("Address:");
         l5.setBounds(610,500,300,45);
          l5.setFont(new Font("GEORGIA", Font.BOLD,30));
         l5.setForeground(Color.WHITE);

          // address
          t4=new JTextField("");
            t4.setBounds(800,500,300,40);
              t4.setFont(new Font("Arial",Font.BOLD,20));
              t4.setForeground(Color.WHITE);
            t4.setBackground(Color.BLACK);

            b1=new JButton("New");
            b1.setBounds(380,600,150,40);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);

             b2=new JButton("Save");
            b2.setBounds(580,600,150,40);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);

             b3=new JButton("Modify");
            b3.setBounds(780,600,150,40);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);

             b4=new JButton("Delete");
            b4.setBounds(980,600,150,40);
            b4.setBackground(Color.BLACK);
            b4.setForeground(Color.WHITE);

             b5=new JButton("Find");
            b5.setBounds(1180,600,150,40);
            b5.setBackground(Color.BLACK);
            b5.setForeground(Color.WHITE);

            

            t6=new JTextField("");
            t6.setBounds(800,680,300,40);
            t6.setFont(new Font("Arial",Font.BOLD,20));
            t6.setForeground(Color.WHITE);
            t6.setBackground(Color.BLACK);
       
      
      

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(t3);
        add(l5);
        add(t4);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(t6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
       

        setVisible(true);
         }catch(Exception e1){
            System.out.println(e1.toString());
         }
   }



      // ----------------- New Button --------------.



      public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
           t1.requestFocus();
           t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");
        }


      
        // ------------- Save Button ------------.



           else if(e.getSource()==b2){
            try{
                 //String s1="insert into student2 values('Anil',12,'Fatehabad','9089785634')";       // yha ek string li hai s1 jisme insert into vali line jakr mysql me add ho jayegi or ek new line add kardegi
                  String name,rollno,phone,address;
                  name=t1.getText().toString();
                  rollno=t2.getText().toString();
                  phone=t3.getText().toString();
                  address=t4.getText().toString();


                 

                 String s1="insert into student2 values('"+name+"',"+rollno+",'"+address+"','"+phone+"')";    
                 stmt=con1.createStatement();        // khali statement create kregi jha bhi hmari s1 string jis bhi jgah par satisfy ho rahi hai.
                    stmt.executeUpdate(s1);           // is line se mysql me data update ho jayega.     
                  JOptionPane.showMessageDialog(this,"Are you sure you want to save this item? ✅");
            }
            catch(Exception e2)
            {
            }
            }




            //---------- Modify Button ----------.




            else if(e.getSource()==b3){
              try{
                String modify1=t6.getText().toString();
                
                String name1=t1.getText().toString();
                String roll_no=t2.getText().toString();
                String phone_no=t3.getText().toString();
                String address1=t4.getText().toString();
                String mod="update student2 set name='"+name1+"',rollno="+roll_no+",address='"+address1+"',phone='"+phone_no+"' where rollno="+modify1;
          
                // JOptionPane.showMessageDialog(this,"Are you sure you want to modify this item? ✅");
                  stmt=con1.createStatement();      
                 stmt.executeUpdate(mod);
              }catch(Exception e3){
                JOptionPane.showMessageDialog(this,e3.toString());
              }
            }




            //---------- Delete Button ----------.

            else if(e.getSource()==b4){
              try{
              String delete1;
              delete1=t6.getText().toString();
              String del="delete from student2 where rollno="+delete1;
               JOptionPane.showMessageDialog(this,"Are you sure you want to delete this item? ✅");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");

                stmt=con1.createStatement();      
                stmt.executeUpdate(del);

                
              }catch(Exception e4){
                JOptionPane.showMessageDialog(this,"Error");
              }
            }



            // ----------- Find Button ---------.

            else if(e.getSource()==b5){
              try{
              String find;
               find=t6.getText().toString();
                ResultSet rs=stmt.executeQuery("Select * from student2 where rollno="+find);
                    if(rs.next()){
                     t1.setText(rs.getString(1));
                     t2.setText(String.valueOf(rs.getInt(2)));
                     t3.setText(rs.getString(3));
                     t4.setText(rs.getString(4));
                    }
                  }catch(Exception e5){
                    System.out.println("Error");
                  }
            }


          
      }
    
           
          
    public static void main(String args[]){
        a79 obj=new a79();

    }
  }
    


