//--------------Create a Client Class-------------.
import java.rmi.*;
import java.util.Scanner;
public class a83 {
    public static void main(String []args){
    a81 obj2;
    String s1;
    
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter name: ");
     s1=obj.nextLine();
     try{
        String url1="rmi://"+s1+"/abc";
        obj2=(a81)(Naming.lookup(url1));

        s1=obj2.message(s1);
        System.out.println("Recevied from server"+s1);

     }catch(Exception e){
        e.printStackTrace();
     }
    
    }
}
