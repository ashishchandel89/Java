//apply marquee on string with jlabel and swing. 
import javax.swing.*;
import java.awt.*;

class c1 extends JFrame implements Runnable{
    JLabel l1;
    Thread t1,t2;
    int x=1;
    int d=1;
    
    public c1(){
        setSize(2200,1000);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        l1=new JLabel("ASHISH CHANDEL");
        l1.setBounds(10,20,400,40);
        l1.setFont(new Font("GEORGIA",Font.BOLD,35));
        l1.setForeground(Color.YELLOW);

        t1=new Thread(this);
        t2=new Thread(this);
        t1.setName("Thread1");
        t2.setName("Thread2");

        t1.start();
        //t2.start();

    
    
       add(l1);
        setVisible(true);
    }
    public void run(){
        while(true){
            try{
                    while(true){
                       
                    l1.setBounds(x,20,900,40);
                    Thread.sleep(10);
                    if(d==1)
                    x=x+4;  
                    else if(d==2)
                    x=x-4; 
                    if(x>1000)  
                    d=2;
                    else if(x<0)
                    d=1;
                    } 
                        
                    }
                catch(Exception e){

                }
        }
    }
public class a78  {
    public static void main(String[] args){
        c1 obj=new c1();
    }
    
}
}
