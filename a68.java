//buttons of flow layout,grid layout,border layout
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;
import java.awt.event.*;
class c1 extends JFrame implements ActionListener{
        JButton b1,b2,b3,b4;
        Panel p1;

       private JButton create(String text){
            JButton obj=new JButton(text);
           
            obj.setCursor(new Cursor(Cursor.HAND_CURSOR));
            obj.setFont(new Font("GEORGIA",Font.BOLD,26));
            obj.setForeground(Color.WHITE);
            obj.setBackground(Color.BLACK);

            return obj;
        }
    public c1(){
            getContentPane().setBackground(Color.BLACK);
            p1=new Panel();
             p1.setBounds(580,300,320,320);
             p1.setLayout(new FlowLayout());;

             setSize(5000,5000);
            
             b1=create("FLOW LAYOUT");
             b2=create("GRID LAYOUT");
             b3=create("BORDER LAYOUT");
             b4=create("NULL LAYOUT");
      


        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        add(p1);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
         setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            p1.setLayout(new FlowLayout());

        }
        else if(e.getSource()==b2){
          p1.setLayout(new GridLayout(2,2));
         
    }
     else if(e.getSource()==b3){
        p1.setLayout(new BorderLayout());
            p1.add(b1,BorderLayout.EAST);
            p1.add(b2,BorderLayout.WEST);
            p1.add(b3,BorderLayout.NORTH);
            p1.add(b4,BorderLayout.SOUTH);
     }
     else if(e.getSource()==b4){
        p1.setLayout(null);
        b1.setBounds(200,400,400,40);
        b2.setBounds(400,500,400,40);
        b3.setBounds(600,600,400,40);
        b4.setBounds(800,700,400,40);

     }
     revalidate();
     repaint();
     p1.revalidate();
     p1.repaint();
}
}

public class a68 {
    public static void main(String []args){
        c1 obj=new c1();
    }
}
