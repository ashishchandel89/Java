// SUM, SUBTRACT, MULTIPLY, DIVIDE
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class c1 extends JFrame{
        JButton b1,b2,b3,b4;
        JLabel l1,l2,l3;
        JTextField t1,t2,t3;
        public c1(){
       
        setSize(5000,5000);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
       
       
        l1=new JLabel(" FIRST NO: ");
        l1.setBounds(400,250,300,45);
        l1.setFont(new Font("ALGERIAN",Font.BOLD,40));
        l1.setForeground(Color.RED);

        l2=new JLabel(" SECOND NO: ");
        l2.setBounds(400,320,300,45);
        l2.setFont(new Font("ALGERIAN",Font.BOLD,40));
        l2.setForeground(Color.RED);
       
        l3=new JLabel(" RESULT: ");
        l3.setBounds(400,390,300,45);
        l3.setFont(new Font("ALGERIAN",Font.BOLD,40));
        l3.setForeground(Color.RED);
        

        //t1


        t1=new JTextField();
        t1.setBounds(700,248,250,40);
         t1.addMouseListener(new MouseAdapter(){
              public void mouseEntered(MouseEvent e){
                t1.setBackground(Color.RED);
                 t1.setFont(new Font("GEORGIA",Font.BOLD,15));
                t1.setForeground(Color.WHITE);
              
            } 
            public void mouseExited(MouseEvent e) {           
                t1.setBackground(Color.BLACK);
                 t1.setFont(new Font("GEORGIA",Font.BOLD,15));
                t1.setForeground(Color.WHITE);
            }   
        });



        //t2.


       
        t2=new JTextField();
        t2.setBounds(700,318,250,40);
        t2.addMouseListener(new MouseAdapter(){
              public void mouseEntered(MouseEvent e){
                t2.setBackground(Color.RED);
                t2.setFont(new Font("GEORGIA",Font.BOLD,15));
                t2.setForeground(Color.WHITE);
              
            } 
            public void mouseExited(MouseEvent e) {           
                t2.setBackground(Color.BLACK);
            }   
        });


        //t3

        
        t3=new JTextField();
        t3.setBounds(700,388,250,40);
       t3.addMouseListener(new MouseAdapter(){
              public void mouseEntered(MouseEvent e){
                t3.setBackground(Color.RED);
                t3.setFont(new Font("GEORGIA",Font.BOLD,15));
                t3.setForeground(Color.WHITE);
              
            } 
            public void mouseExited(MouseEvent e) {           
                t3.setBackground(Color.BLACK);
            }   
        });


       //b1

       
       b1=new JButton("SUM");
        b1.setBounds(403,500,100,30);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                b1.setBackground(Color.RED);
                b1.setFont(new Font("GEORGIA",Font.BOLD,11));
                b1.setForeground(Color.BLACK);
            } 
            
           
            public void mouseExited(MouseEvent e) {           
                b1.setBackground(Color.BLACK);
                b1.setFont(new Font("GEORGIA",Font.BOLD,11));
                b1.setForeground(Color.WHITE);
            }
            
        });

        
        //b2


        
        b2=new JButton("SUBTRACT");
        b2.setBounds(550,500,100,30);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                b2.setBackground(Color.RED);
                b2.setFont(new Font("GEORGIA",Font.BOLD,11));
                b2.setForeground(Color.BLACK);
            } 
            
           
            public void mouseExited(MouseEvent e) {           
                b2.setBackground(Color.BLACK);
                b2.setFont(new Font("GEORGIA",Font.BOLD,11));
                b2.setForeground(Color.WHITE);
            }
            
        });
       

        //b3



        b3=new JButton("MULTIPLY");
        b3.setBounds(710,500,100,30);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                b3.setBackground(Color.RED);
                 b3.setFont(new Font("GEORGIA",Font.BOLD,11));
                b3.setForeground(Color.BLACK);
            }
            public void mouseExited(MouseEvent e){
                b3.setBackground(Color.BLACK);
                b3.setFont(new Font("GEORGIA",Font.BOLD,11));
                b3.setForeground(Color.WHITE);
            }
        });


        //b4

        b4=new JButton("DIVIDE");
        b4.setBounds(850,500,100,30);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                b4.setBackground(Color.RED);
                 b4.setFont(new Font("GEORGIA",Font.BOLD,11));
                b4.setForeground(Color.BLACK);
            }
            public void mouseExited(MouseEvent e){
                b4.setBackground(Color.BLACK);
                b4.setFont(new Font("GEORGIA",Font.BOLD,11));
                b4.setForeground(Color.WHITE);
            }
        });
    
        add(l1);
        add(l2);
        add(l3);

        add(t1);
        add(t2);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setVisible(true);
        }    
}
public class a60{
    public static void main(String []args){
        c1 obj=new c1();
    }
}
