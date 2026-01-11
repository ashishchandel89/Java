// JTree Pre-Creation Code Window
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
class c1 extends JFrame implements TreeSelectionListener{
    JTree j1;
    DefaultMutableTreeNode root,lang,java,ad_java,cpp,cs,c,py,soft,ios,linux,window;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;

    public void f1(JTextField text){
       text.setBackground(Color.BLACK);
        text.setFont(new Font("Arial",Font.PLAIN,18));
        text.setForeground(Color.WHITE);
        text.setAlignmentX(CENTER_ALIGNMENT);
        text.setMargin(new Insets(0,15,0,0));
    }

    public c1(){

        setSize(1800,1000);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);

        //root node 

        root=new DefaultMutableTreeNode("Root");

        //creating parent node

        lang=new DefaultMutableTreeNode("Languages");
        root.add(lang);

        //child node 

        java=new DefaultMutableTreeNode("Java");
        lang.add(java);

        ad_java=new DefaultMutableTreeNode("Advance Java");
        lang.add(ad_java);

        cpp=new DefaultMutableTreeNode("C++");
        lang.add(cpp);

        cs=new DefaultMutableTreeNode("C#");
        lang.add(cs);

        c=new DefaultMutableTreeNode("C");
        lang.add(c);

        py=new DefaultMutableTreeNode("Python");
        lang.add(py);

        // creating another branch node

        soft=new DefaultMutableTreeNode("Software");
        root.add(soft);

        // creating leaf node

        window=new DefaultMutableTreeNode("Window");
        soft.add(window);

        linux=new DefaultMutableTreeNode("Linux");
        soft.add(linux);

        ios=new DefaultMutableTreeNode("IOS");
        soft.add(ios);

         l1=new JLabel(" Parent Name: ");
        l1.setBounds(500,300,300,45);
        l1.setFont(new Font("Arial",Font.BOLD,30));
        l1.setForeground(Color.WHITE);
        add(l1);
        
         l2=new JLabel(" Node Name: ");
        l2.setBounds(500,400,300,45);
        l2.setFont(new Font("Arial",Font.BOLD,30));
        l2.setForeground(Color.WHITE);
        add(l2);

         l3=new JLabel(" Type of Node: ");
        l3.setBounds(500,500,300,45);
        l3.setFont(new Font("Arial",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        add(l3);

         l4=new JLabel(" Number of Child: ");
        l4.setBounds(500,600,350,45);
        l4.setFont(new Font("Arial",Font.BOLD,30));
        l4.setForeground(Color.WHITE);
        add(l4);

         t1=new JTextField("");
        t1.setBounds(800,300,330,40);
        f1(t1);
        add(t1);
        
         t2=new JTextField("");
        t2.setBounds(800,400,330,40);
        f1(t2);
        
        
        add(t2);
        
        t3=new JTextField("");
        t3.setBounds(800,500,330,40);
        f1(t3);
        add(t3);

        t4=new JTextField("");
        t4.setBounds(800,600,330,40);
        f1(t4);
        add(t4);

        
        
        

        j1=new JTree(root);
        j1.setBounds(200,100,300,500);
        j1.setBackground(Color.BLACK);
        add(j1);

        
       j1.addTreeSelectionListener(this);
        setVisible(true);
    }

    public void valueChanged(TreeSelectionEvent e){
        if(e.getSource()==j1){
        try{
            DefaultMutableTreeNode obj=(DefaultMutableTreeNode)j1.getLastSelectedPathComponent();     //selceted node return karta hai.
            String name="";
            Object node=obj.getUserObject();    //us node ka actual value deta hai jo ki "java","c++","software" jaise values ho skti hai
            if(obj.isRoot()){
                t1.setText("");               //kuki root ka koi parent nahi hota.
                t2.setText(node.toString());     //matlab jo j1 ka object select hua tha uska object jaise "java","c++". vo getUserObject() method ke through bta de ki kis name ka object hai.
                t3.setText("Root");            //type aajayega ki kon sa type hai jo node selecte hua hai. jaise "root" hai ya "parent" hai.
                t4.setText(""+obj.getChildCount());
            }else{
                name=obj.getParent().toString();  //parent btayega ki is node ka kon hai or use string e store kara dega
                t1.setText(name);                   //ab us string ko t1 textfeild me store kar dia.
                t2.setText(node.toString());        //actual value t2 me node ki store kra di.
                if(obj.isLeaf()){
                    t3.setText("Leaf");            //agar node leaf hai type of node me print karde leaf
                }
                else {
                    t3.setText("Parent");           //nahi to parent 
                }
                int num=obj.getChildCount();            //int num variable me childcound method se count ki huii value store kara de
                t4.setText(""+num);                     //or yha is Number of Child Node me child kitne hai vo bhi show karwa de.
                
            }

            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
}

public class a73 {
    public static void main(String[]args){
        c1 obj=new c1();
    }
    
}
