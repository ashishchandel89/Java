//checkbox
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class c1 extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
        JButton b1;
        JTextField t1;
        JCheckBox jc1,jc2,jc3;
    public c1(){
        

        setSize(5000,5000);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);

        l1=new JLabel("SPORTS");
        l1.setBounds(530,103,300,45);
        l1.setFont(new Font("GEORGIA", Font.BOLD,26));
        l1.setForeground(Color.RED);

        l2=new JLabel("MUSIC");
        l2.setBounds(730,103,300,45);
        l2.setFont(new Font("GEORGIA",Font.BOLD,26));
        l2.setForeground(Color.WHITE);

        l3=new JLabel("MOVIES");
        l3.setBounds(930,103,300,45);
        l3.setFont(new Font("GEORGIA",Font.BOLD,26));
        l3.setForeground(Color.RED);

        jc1=new JCheckBox("Sports");
        jc1.setBounds(510,120,15,15);
        jc1.setBackground(Color.RED);
        

        jc2=new JCheckBox("");
        jc2.setBounds(710,120,15,15);
        jc2.setBackground(Color.RED);

        jc3=new JCheckBox("");
        jc3.setBounds(910,120,15,15);
        jc3.setBackground(Color.RED);

        t1=new JTextField("");
        t1.setBounds(510,250,540,40);
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        t1.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                t1.setBackground(Color.RED);
                t1.setFont(new Font("GEORGIA",Font.BOLD,13));
            }
            public void mouseExited(MouseEvent e){
                t1.setBackground(Color.BLACK);
                t1.setFont(new Font("GEORGIA",Font.BOLD,13));
            }

        });
        
        b1=new JButton("SHOW");
        b1.setBounds(710,380,100,30);
        b1.setBackground(Color.BLACK);
        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                b1.setBackground(Color.RED);
                b1.setFont(new Font("GEORGIA",Font.BOLD,13));
            }
            public void mouseExited(MouseEvent e){
                b1.setBackground(Color.BLACK);
                b1.setFont(new Font("GEORGIA",Font.BOLD,13));

            }
        });
        
        addActionListener(this);
        add(jc1);
        add(jc2);
        add(jc3);
        
       

        add(l1);
        add(l2);
        add(l3);
        add(jc1);
        add(jc2);
        add(jc3);
        add(t1);
        add(b1);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){                      //important and unique
            if(jc1.isSelected()){
                t1.setText(t1.getText().toString()+"Sports");
            }
        
      if(jc1.isSelected()){
                t1.setText(t1.getText().toString()+" Music");
            }
        }
       if(jc1.isSelected()){
                t1.setText(t1.getText().toString()+" Movies");
            }
    }
    }


public class a63{
    public static void main(String ags[]){
        c1 obj=new c1();
    }
}