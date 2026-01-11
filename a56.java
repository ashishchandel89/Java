//swing with gridlayout
import javax.swing.*;
import java.awt.*;
class c1 extends JFrame{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    public c1(){
        setSize(500,500);
        setLayout(new GridLayout(5,5));
        b1=new JButton("A");
        b2=new JButton(" B");
        b3=new JButton(" C");
        b4=new JButton(" D");
        b5=new JButton(" E");
        b6=new JButton(" F");
        b7=new JButton(" G");
        b8=new JButton(" H");
        b9=new JButton(" I");
        b10=new JButton(" J");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);

setVisible(true);
    }
}
public class a56{
    public static void main(String args[]){
        c1 obj=new c1();
    }
}