
//  C L I E N T   ----   C L A S S 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class a89 extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextArea t1;
    a87 obj;
    public a89(){
    setSize(1200,1000);
    setLayout(null);
     getContentPane().setBackground(Color.BLACK); 
    
    b1=new JButton("Morning");
    b1.setBounds(400,250,130,60);
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);

    b2=new JButton("Night");
    b2.setBounds(600,250,130,60);
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);

    t1=new JTextArea("");
    t1.setBounds(360,480,400,250);
    t1.setFont(new Font("Arial",Font.BOLD,13));
    t1.setForeground(Color.BLACK);
   


    add(b1);
    add(b2);
    add(t1);

    b1.addActionListener(this);
    b2.addActionListener(this);
   
    setVisible(true); 
    }

    public void actionPerformed(ActionEvent e){
        t1.setText("");
        if(e.getSource()==b1){
            try{
                t1.setText("");
                obj=new a87("localhost",1245);
                obj.println("morning");
                t1.append(obj.readLine() + "\n");
                t1.append(obj.readLine() + "\n");
                t1.append(obj.readLine() + "\n");

                obj.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==b2){
            try{
                t1.setText("");
                obj=new a87("localhost",1245);
                obj.println("night");
                t1.append(obj.readLine() + "\n");
                t1.append(obj.readLine() + "\n");
                t1.append(obj.readLine() + "\n");

                obj.close();

            }catch(Exception ex1){
                ex1.printStackTrace();
            }
        }
    }
    

    public static void main(String []args){
        a89 obj2=new a89();
        }
}