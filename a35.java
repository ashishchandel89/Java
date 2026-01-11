//random value
import java.util.Random;
public class a35{
    public static void main(String args[]){
        Random r = new Random();
        int a = r.nextInt();
        double b = r.nextDouble();
        float c = r.nextFloat();
       
        System.out.println("random no. of integer data type: "+a);
        System.out.println("random no. of double data type: "+b);
        System.out.println("random no. of float data type: "+c);
       
    }
}
