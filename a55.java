//swing with flowlayout
import javax.swing.*;
import java. awt.*;
class c1 extends JFrame{ //extends the jframe class which is inbuilt
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;   //declare three button object.that's are different different types of jbutton variable.
    public c1(){
        setSize(300,300);     //give here GUI size (width,height)
        setLayout(new FlowLayout());
        b1=new JButton(" A");
        b2=new JButton(" B");
        b3=new JButton(" C");
        b4=new JButton(" D");
        b5=new JButton(" E");
        b6=new JButton(" F");
        b7=new JButton(" G");
        b8=new JButton(" H");
        b9=new JButton(" I");
        b10=new JButton(" J");
        add(b1);    //thats mean show b1 button into frame
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        setVisible(true);   //it means show the button on screen.
    }
}
public class a55{
    public static void main(String args[]){
        c1 obj=new c1();
        
    }
}
