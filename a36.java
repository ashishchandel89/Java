//display 10 random integer values.
import java.util.Random;
public class a36{
    public static void main(String args[]){
        int a;
        for(a=0;a<=9;a++){
            Random obj= new Random();
            int b=obj.nextInt();
            System.out.println(""+b);
        }

    }
}