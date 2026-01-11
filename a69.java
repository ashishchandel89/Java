//login user1 and user2 with thier passwords
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;
import javax.swing.border.LineBorder;
import java.awt.event.*;

class c1 extends JFrame implements ActionListener{
    JTextField t1;
    JPasswordField t2;
    JLabel l1,l2,l3;
    JButton b1; 
    public c1(){
       
        
       
         setSize(5000,5000); 
        getContentPane().setBackground(Color.BLACK);

        JFrame obj=new JFrame("Login Form");
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(700,700);
        obj.setLocationRelativeTo(null);
       

        JPanel p1=new JPanel();
        p1.setBounds(40,100,700,800);
        p1.setBackground(Color.BLACK);
       
        p1.setLayout(null);


        

        l3=new JLabel("LOGIN");
         l3.setBounds(630,100,300,45);
          l3.setFont(new Font("GEORGIA", Font.BOLD,30));
         l3.setForeground(Color.YELLOW);

         l1=new JLabel("USER  ID        :");
         l1.setBounds(490,240,300,45);
         l1.setFont(new Font("GEORGIA", Font.BOLD,30));
         l1.setForeground(Color.YELLOW);

         l2=new JLabel("PASSWORD  :");
         l2.setBounds(490,340,300,45);
        l2.setFont(new Font("GEORGIA", Font.BOLD,30));
         l2.setForeground(Color.YELLOW);

         t1=new JTextField("");
         t1.setBounds(740,240,200,40);
        t1.setFont(new Font("GEORGIA", Font.BOLD,26));
        t1.setForeground(Color.WHITE);
         t1.setBackground(Color.BLACK);
         t1.setBorder(new LineBorder(Color.YELLOW));

          t2=new JPasswordField("");
          t2.setFont(new Font("GEORGIA", Font.BOLD,26));
          t2.setForeground(Color.WHITE);
         t2.setBounds(740,340,200,40);
         t2.setBackground(Color.BLACK);
         t2.setBorder(new LineBorder(Color.YELLOW));
        
         b1=new JButton("LOGIN");
          b1.setBounds(650,480,100,40);

         b1.setFont(new Font("GEORGIA", Font.BOLD,18));
          b1.setForeground(Color.YELLOW);
         b1.setBackground(Color.BLACK);
         b1.setBorder(new LineBorder(Color.YELLOW));

        b1.addActionListener(this);
        p1.add(t1);
        p1.add(t2);
        p1.add(l1);
        p1.add(l2);
        p1.add(b1);
        p1.add(l3);
        add(p1);
        setVisible(true);        
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){  
            if((t1.getText().equals("user1") && t2.getText().equals("abc")) ||  (t1.getText().equals("user2") && t2.getText().equals("xyz")))
            {
                    //close login window
           welcome obj= new welcome(t1.getText());  //open new welcome page
            }
            else{
                JOptionPane.showMessageDialog(this,"This is Invalid User Id or Password. Please Re-Enter a Valid User Id or Password ");
            }

        }
    }
}

public class a69{

    public static void main(String []args){
        c1 obj=new c1();

    }
}