
// S E R V E R   ----   C L A S S

import java.net.*;
import java.io.*;
import java.util.*;

public class a88 {

    public static final int port=1245;
    ServerSocket ssk1;
    a87 obj;
    Vector morning,night;

    
    public void init(){
        try{
            BufferedReader bf1;
            String line;
            morning=new Vector<>();
            night=new Vector<>();


            bf1=new BufferedReader(new InputStreamReader(new FileInputStream("morning.txt")));

            while((line=bf1.readLine()) != null){
                morning.addElement(line);
            }
            bf1.close();

            bf1=new BufferedReader(new InputStreamReader(new FileInputStream("night.txt")));
            while((line=bf1.readLine()) != null){
                night.addElement(line);
            }
            bf1.close();

            ssk1=new ServerSocket(port);
            while(true){
                System.out.println("Here's the Server ... ready and running.");

                obj=new a87(ssk1.accept());

                String s=obj.readLine();

                System.out.println("Read "+ s +" from Client.");

                if(s.equalsIgnoreCase("morning")){
                    display(morning);
                }

                else if(s.equalsIgnoreCase("night")){
                    display(night);
                }

                else {
                    System.err.println("Invalid request: "+s);
                }

                obj.close();
                System.out.println("Finished Processing .... !");
            }
        }catch(Exception ee){
        ee.printStackTrace();
    }
}
    public void display(Vector v) throws IOException{
        int size1=v.size();
        for(int i=0;i<3;i++){
            int n=(int) (Math.random()*size1);
            obj.println((String)v.elementAt(n));
        }
    }



    public static void main(String[] args){
        a88 obj2=new a88();
        obj2.init();
    }
}
