//JText Area
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class c1 extends JFrame{
        JScrollPane p1;
        JTextArea j1;
        
    public c1(){
        
         //getContentPane().setBackground(Color.BLACK);
         setSize(5000,5000);
         setLayout(null);
        
        
         j1=new JTextArea();       //10 lines and 30  character
        
         p1=new JScrollPane(j1);
        p1.setBounds(200,300,300,60);

        add(p1);
        setVisible(true);
    }
}
public class a67{
    public static void main(String [] args){
        c1 obj=new c1();
}}