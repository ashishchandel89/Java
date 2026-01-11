//accept a string from users and take input from user and show result .
import java.util.Scanner;
public class a22 {
    public static void main(String args[]){
        String s1,result;
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter String: ");
        s1=obj.nextLine();
        Scanner obj2=new Scanner(System.in);
        System.out.print("Enter First No: ");
        a=obj2.nextInt();
        Scanner obj3=new Scanner(System.in);
        System.out.print("No. of elements: ");
        b=obj3.nextInt();
        result=s1.substring(a-1,a+b-1);
        System.out.println("Result: "+result);
        
    }
}
