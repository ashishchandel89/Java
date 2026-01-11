//automatic otp generate.
import java.util.Random;
public class a37 {
    public static void main(String args[]){
       
       int a;
       while(true)
       {
        Random obj=new Random();
        a=obj.nextInt();
        if(a>1000 && a<9999){
            System.out.println(""+a);
            break;
        }
        
       }

    }
}