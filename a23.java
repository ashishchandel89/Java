//excpetion handling.
import java.util.InputMismatchException;
import java.util.Scanner;
public class a23 {
    public static void main(String args[]){
        try{
        int a,b,c;
        System.out.print("enter num1: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.print("enter num2: ");
        Scanner obj2=new Scanner(System.in);
        b=obj2.nextInt();
        c=a/b;
        System.out.println("division of num1 & num2: "+c);
        
    }
        catch(InputMismatchException obj){//for catching the exception.
            System.out.println("Please enter a valid integer");
        }
       
        catch(ArithmeticException obj2){
            System.out.println("division of an integer by 0 is nothing");
        }
        finally{//for final meassage.

        }System.out.println("Okay, THANKS!");
    }
}

    
    

