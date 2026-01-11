// MALE AND FEMALE

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class c1 extends JFrame implements ActionListener{
     JRadioButton j1,j2;
        JLabel l1,l2;
        JTextField t1;
        JButton b1;

    public c1(){
       
        setSize(5000,5000);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);

        j1=new JRadioButton("");
        j1.setBounds(590,115,18,15);
        j1.setBackground(Color.RED);

        j2=new JRadioButton("");
        j2.setBounds(790,115,18,15);
        j2.setBackground(Color.RED);

        l1=new JLabel("MALE");
        l1.setBounds(630,100,300,45);
        l1.setFont(new Font("GEORGIA", Font.BOLD,26)); 
        l1.setForeground(Color.RED);

        l2=new JLabel("FEMALE");
        l2.setBounds(830,100,300,45);
        l2.setFont(new Font("GEORGIA", Font.BOLD,26));
        l2.setForeground(Color.WHITE);
        
        t1=new JTextField("");
        t1.setBounds(630,250,330,40);
        t1.setBackground(Color.RED);
         t1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                t1.setBackground(Color.RED);
                 t1.setFont(new Font("GEORGIA",Font.BOLD,11));
                t1.setForeground(Color.BLACK);
            }
            public void mouseExited(MouseEvent e){
                t1.setBackground(Color.BLACK);
                t1.setFont(new Font("GEORGIA",Font.BOLD,11));
                t1.setForeground(Color.WHITE);
            }
        });
        
        b1=new JButton("SHOW");
        b1.setBounds(740,350,100,30);
       
        b1.setForeground(Color.WHITE);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                b1.setBackground(Color.RED);
                 b1.setFont(new Font("GEORGIA",Font.BOLD,11));
                b1.setForeground(Color.BLACK);
            }
            public void mouseExited(MouseEvent e){
                b1.setBackground(Color.BLACK);
                b1.setFont(new Font("GEORGIA",Font.BOLD,11));
                b1.setForeground(Color.WHITE);
            }
        });
        ButtonGroup bg=new ButtonGroup();
        bg.add(j1);
        bg.add(j2);
        b1.addActionListener(this);
        
        add(l1);
        add(l2);
        add(t1);
        add(b1);
        add(j1);
        add(j2);                

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        System.out.println("hello");
        if(e.getSource()==b1){
            if(j1.isSelected()){
                t1.setText("Mr.");
                
           }
           else if(j2.isSelected()){
            t1.setText("Mrs.");
           }
        }
    }

}
public class a62 {
    public static void main(String ars[]){
    c1 obj=new c1();
}
}
