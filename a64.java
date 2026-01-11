//combo-box
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class c1 extends JFrame implements ItemListener{
    JComboBox combo1,combo2,combo3,combo4;
    JTextField t1;
    public c1(){
        setSize(5000,5000);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        
        t1=new JTextField("");
        t1.setBounds(450,200,200,40);

        combo1=new JComboBox();

        combo1.addItem("DELHI");
        combo1.addItem("MUMBAI");
        combo1.addItem("KOLKATA");
        combo1.addItem("CHENNAI");
        combo1.setBounds(458,300,300,50);

        combo1.addItemListener(this);           //important
        add(t1);
        add(combo1);
        
        setVisible(true);                       //important

       
    }

    public void itemStateChanged(ItemEvent e){               //important and unique
        if(e.getSource()==combo1){                                 
            t1.setText(String.valueOf(combo1.getSelectedItem()));
        }
    }
}
public class a64 {
    public static void main(String [] args){
        c1 obj=new c1();
    }
}
