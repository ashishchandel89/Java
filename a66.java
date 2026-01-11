//image icon in java with swing
import javax.swing.*;
import java.awt.*;
class c1 extends JFrame {

    public c1(){
        setSize(5000,5000);
         ImageIcon obj2=new ImageIcon("background2.jpg");
         
        JLabel l1=new JLabel(obj2);
        l1.setBounds(10,10,4000,4000);

        add(l1);
        setVisible(true);
        }
}

public class a66{
    public static void main(String [] args){
        c1 obj=new c1();

    }
}