//null layout
import javax.swing.*;
import java.awt.*;
class c1 extends JFrame{
    JButton b1,b2,b3;
    public c1(){
        setSize(5000,5000);
        setLayout(null);
        b1=new JButton("A");
        b2=new JButton("B");
        b3=new JButton("C");
        b1.setBounds(0,100,300,300);
        b2.setBounds(400,300,300,300);
        b3.setBounds(800,500,300,300);
        add(b1);
        add(b2);
        add(b3);
        setVisible(true);
    }
}
public class a58{
    public static void main(String args[]){
        c1 obj=new c1();
    }
}