//borderlayout in swing 
import javax.swing.*;
import java.awt.*;
class c1 extends JFrame{
    JButton b1,b2,b3,b4,b5; //take jbutton in b1,b2,b3 etc variables
    public c1(){
        setSize(500,500);       //take screen size
        setLayout(new BorderLayout());  //set border layout
        b1=new JButton("A");    //tak
        b2=new JButton("B");
        b3=new JButton("C");
        b4=new JButton("D");
        b5=new JButton("E");

        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.NORTH);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);
        setVisible(true);
    }
}
public class a57{
    public static void main(String args[]){
        c1 obj=new c1();
    }
}