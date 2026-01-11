//calculator project in GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;


 
class c1 extends JFrame implements ActionListener{
    JButton b1,b2,b3,bb1,b4,b5,b6,b7,b8,b9,b0,bb2,bb3,bb4,bb5,bb6;
    JTextField t1;
    
    Panel p1,p2;

    private JButton createButton(String text){
        JButton obj=new JButton(text);
        obj.setBackground(Color.BLACK);
        obj.setFont(new Font("SansSerif",Font.BOLD,26));
        obj.setForeground(Color.WHITE);
        obj.setCursor(new Cursor(Cursor.HAND_CURSOR));
         return obj;
    }
        private JButton createButton2(String text){
        JButton obj2=new JButton(text);
        obj2.setBackground(Color.RED);
        obj2.setFont(new Font("SansSerif",Font.BOLD,26));
        obj2.setForeground(Color.WHITE);
        obj2.setCursor(new Cursor(Cursor.HAND_CURSOR));
            return obj2;
        }
     




       
    public c1(){
        
         getContentPane().setBackground(Color.BLACK);
            //panel 2
         p2=new Panel();
         p2.setLayout(null);
         p2.setSize(500,500);
          p2.setBounds(580,100,320, 20);
         

         t1=new JTextField("");
         t1.setBounds(580,150,320,126);
         t1.setBackground(Color.BLACK);
         t1.setFont(new Font("SansSerif",Font.BOLD,36));
         t1.setForeground(Color.WHITE);
       
         setSize(5000,5000);
        //panel 1

         p1= new Panel();
         p1.setSize(500,500);
        p1.setBounds(580,300,320,320);
        p1.setLayout(new GridLayout(4,4,10,10));

       
        b1=createButton("7");
         b2=createButton("8");
         b3=createButton("9");
         bb1=createButton2(" /");

        

         b4=createButton(" 4");
         b5=createButton(" 5");
         b6=createButton(" 6");
         bb2=createButton2(" *");

         b7=createButton(" 1");
         b8=createButton(" 2");
         b9=createButton(" 3");
         bb3=createButton2(" -");

        b0=createButton(" 0");
         bb4=createButton("C");
         bb5=createButton(" =");
          bb6=createButton2(" +");



        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
         p1.add(bb1);

        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
         p1.add(bb2);

        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
         p1.add(bb3);

        p1.add(b0);
        
         
          
            p1.add(bb4);
             p1.add(bb5);
              p1.add(bb6);
           

        add(p1);
       p2.add(t1);
       add(p2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
       
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
         bb1.addActionListener(this);
          bb2.addActionListener(this);
           bb3.addActionListener(this);
            bb4.addActionListener(this);
             bb5.addActionListener(this);
             bb6.addActionListener(this);


        setVisible(true);

    }
    int total;
            char op;
    public void actionPerformed(ActionEvent e){
         
        if(e.getSource()==b1){
           
        t1.setText(t1.getText()+"7");
        }
        else if(e.getSource()==b2){
        t1.setText(t1.getText()+"8");
        }
        else if(e.getSource()==b3){
        t1.setText(t1.getText()+"9");
        }

        //  (/)

        else if(e.getSource()==bb1){
            total=Integer.parseInt(t1.getText());
            op='/';
        t1.setText("");
        }
        else if(e.getSource()==b4){
        t1.setText(t1.getText()+"4");
        }
        else if(e.getSource()==b5){
         t1.setText(t1.getText()+"5");
        }
        else if(e.getSource()==b6){
         t1.setText(t1.getText()+"6");
        }

        //     (*)

        else if(e.getSource()==bb2){
            total=Integer.parseInt(t1.getText());
            op='*';
        t1.setText("");
        }

        else if(e.getSource()==b7){
        t1.setText(t1.getText()+"1");
        }
        else if(e.getSource()==b8){
         t1.setText(t1.getText()+"2");
        }
        else if(e.getSource()==b9){
        t1.setText(t1.getText()+"3");
        }

        //  (-)

        else if(e.getSource()==bb3){
            total=Integer.parseInt(t1.getText());
            op='-';
        t1.setText("");
        }

        // (0)

        else if(e.getSource()==b0){
         t1.setText(t1.getText()+"0");
        }

        // (C)

         else if(e.getSource()==bb4){
         t1.setText("");
        }
        
        //  (+)

         else if(e.getSource()==bb6){
           
            total=Integer.parseInt(t1.getText());       //phli value total me save hogyi
            op='+';                                     //operator bhi op me save hogya
            t1.setText("");                           //text field empty hogya.
        }

        //    (=)
        
         else if(e.getSource()==bb5){
            if(op=='+'){
                t1.setText(String.valueOf(total+Integer.parseInt(t1.getText())));       //yha par t1.ke andr result store ho gya.kyuki humne total or (new t1 value) ko add kar dai 
            }
            else if(op=='-'){
                t1.setText(String.valueOf(total-Integer.parseInt(t1.getText())));
            }
            else if(op=='*'){
                t1.setText(String.valueOf(total*Integer.parseInt(t1.getText())));
            }
            else if(op=='/'){
                t1.setText(String.valueOf(total/Integer.parseInt(t1.getText())));
            }
          
         }
      
        
    }


}
public class a65 {
public static void main(String args[]){
    c1 obj=new c1();
}
}