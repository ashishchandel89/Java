import java.util.*;
import javax.swing.*;
import java.awt.*;
class c1 extends JFrame{
    int rows,cols;
        private String [] s1_heading=new String[]{"Roll No","Name","Age"};
        private String s1[][]=new String[rows][cols];

    public c1(){
        System.out.println("Enter the size of table rows and columns");
        System.out.print("Enter the row's size: ");
        Scanner obj=new Scanner(System.in);
         rows=obj.nextInt();
        System.out.print("Enter the size of columns: ");
         cols=obj.nextInt();

        
        for(int i=0;i<rows;i++){                // ROWS
            for(int j=0;j<cols;j++){            //COLUMNS
                String.valueOf(s1[i][j]=obj.nextLine());
            }
        }
        
                JTable obj3=new JTable(s1_heading,s1);
        JScrollPane obj2=new JScrollPane(obj3);
                    obj2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);     //always scroll bar rakhne ke liye.
                    obj2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                    add(obj2);
        setVisible(true);
    }
}
public class a72{
    public static void main(String []args){
        c1 obj=new c1();

    }
}