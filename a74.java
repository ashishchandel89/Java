import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class c1 extends JFrame implements ActionListener{
    JList list1;
    DefaultListModel model;
    JTextField t1;
    JButton b1,b2;
    
    public c1(){
        setSize(1800,900);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);

        t1=new JTextField("");
        t1.setBounds(600,100,400,40);
        t1.setFont(new Font("Arial",Font.PLAIN,20));
        add(t1);

        b1=new JButton("Add");
        b1.setBounds(640,150,100,40);
        b1.setFont(new Font("Arial",Font.PLAIN,20));
        b1.setBackground(Color.GREEN);
    
        add(b1);

        b2=new JButton("Remove");
        b2.setBounds(720,150,150,40);
        b2.setFont(new Font("Arial",Font.PLAIN,20));
        b2.setBackground(Color.GREEN);
        add(b2);



        model=new DefaultListModel();
        model.addElement("Kolkata");
        model.addElement("Haryana");
        model.addElement("Punjab");
        model.addElement("Chennai");
        model.addElement("Mumbai");
        model.addElement("Delhi");

        list1=new JList(model);
        list1.setBounds(600,300,400,200);
        add(list1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
      String s= JOptionPane.showInputDialog(this,"Enter value");
      model.addElement(s);
        }
        if(e.getSource()==b2){
            model.remove(list1.getSelectedIndex());     //getSelected() method hai jo ek jo ki selected item ka index leta hai apne method ki help se or remove keyword use remove karne ke liye use hota hai. 
        }
        
    }
}
public class a74 {
    public static void main(String [] args){
        c1 obj=new c1();
    }
}
