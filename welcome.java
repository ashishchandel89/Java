import javax.swing.*;
import java.awt.*;
    
public class welcome extends JFrame{
   
    JLabel l1;
    public welcome(String text){
       setSize(5000,5000);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        l1=new JLabel("WELCOME "+text);
        l1.setBounds(600,200,500,40);
        l1.setFont(new Font("GEORGIA", Font.BOLD,50));
        l1.setForeground(Color.YELLOW);
        add(l1);


        setVisible(true);
    }
}



       


