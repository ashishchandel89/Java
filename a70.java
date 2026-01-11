//Build a Notepad Editter
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class c1 extends JFrame implements ActionListener{
    JMenu m1,m2,m3;
    JTextArea j1;
    JMenuItem i1,i2,i3,i4,i5,i6;
    JMenuBar b1;
    public c1(){
        super("Notepad");
        
        setSize(5000,5000);
        

        m1=new JMenu();
        m2=new JMenu();
        m3=new JMenu();
         
        i1=new JMenuItem("");
        i2=new JMenuItem("");
        i3=new JMenuItem("");
        i4=new JMenuItem("");
        i5=new JMenuItem("");
        i6=new JMenuItem("");

        m1.setText("File");
        m2.setText("Format");
        m3.setText("Color");

        i1.setText("New");
        i2.setText("Save");
        i3.setText("Open");
        i4.setText("Exit");

        i5.setText("Text Color");
        i6.setText("Back Color");

        b1=new JMenuBar();
        b1.add(m1);
        b1.add(m2);
        b1.add(m3);
        setJMenuBar(b1);

        
        setLayout(null);
        j1=new JTextArea("");
        j1.setFont(new Font("Arial",Font.PLAIN,20));
      JScrollPane bar1=new JScrollPane(j1);
       bar1.setBounds(10,3,1510,740);
        
      add(bar1);
      m1.setFont(new Font("Arial",Font.PLAIN,20));
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);

        m2.add(m3);
        m3.add(i5);
        m3.add(i6);

        j1.setLineWrap(true);

        i4.addActionListener(this);
       i2.addActionListener(this);
       i3.addActionListener(this);
       i5.addActionListener(this);
       i6.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
try
{
        // i1 new file bar item

        if(e.getSource()==i1){
       j1.setText("");
       }

       // i2 save file bar item
       
        else if(e.getSource()==i2){
            try{
            JFileChooser jf_obj=new JFileChooser();
            jf_obj.showSaveDialog(this);
            String file=jf_obj.getSelectedFile().getPath();
            FileWriter fw_obj=new FileWriter(file);
            BufferedWriter bw_obj=new BufferedWriter(fw_obj);
            bw_obj.write(j1.getText());
            bw_obj.close();
            fw_obj.close();    
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }

        // i3 open file bar item

        else if(e.getSource()==i3){
           JFileChooser jf_obj2=new JFileChooser();
           jf_obj2.showOpenDialog(this);
           String file2=jf_obj2.getSelectedFile().getPath();
           FileReader fr_obj=new FileReader(file2);
           BufferedReader br_obj=new BufferedReader(fr_obj);
           String s1="";
           while((s1=br_obj.readLine())!=null)
           {
            j1.append(s1+"\n");
           }
           br_obj.close();
           fr_obj.close();
        }

        // i4 exit file bar item

        else if(e.getSource()==i4){
            System.exit(0);
        }

        // i5 background color change bar item

        else if(e.getSource()==i5){
            Color c_obj2=JColorChooser.showDialog(this,"choose text color",Color.BLACK);
            j1.setForeground(c_obj2);
           
        }

        //i6 text color change bar item

        else if(e.getSource()==i6){
           
             Color c_obj=JColorChooser.showDialog(this,"choose background color",Color.BLACK);

            j1.setBackground(c_obj);
           
        }
    }
    catch(Exception ee)

    {

    }
    }
}
public class a70 {
    public static void main(String []args){
        c1 obj=new c1();
    }
}

