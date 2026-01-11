import java.util.*;
import javax.swing.*;
import java.awt.*;
class c1 extends JFrame{
     private String [] s1_heading=new String[]{"Roll No","Name","Age"};
     private String [][] s2_data=new String[][]{{"1","Ashsih","20"},{"2","Aman","22"},{"3","Amit","20"},{"4","Ankit","21"},{"5","Anil","20"}};

    public c1(){
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        
        
        
        //run page without pressing "ctrl+c" in cmd. To recompile our code.
        JTable obj=new JTable(s2_data,s1_heading);
        JScrollPane obj2=new JScrollPane(obj);
        obj2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);     //always scroll bar rakhne ke liye.
        obj2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(obj2);
        setVisible(true);

    }
}
public class a71{
    public static void main(String []args){
        c1 obj=new c1();
    }
}