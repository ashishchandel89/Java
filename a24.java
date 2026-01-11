//program had not any excpetion but, we want to show exception. keyword="throw".
import java.util.Scanner;
public class a24{
    public static void main(String args[]){
        try{
        int a;
        System.out.print("Enter User's Age: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        if(a>110)
        throw new Exception();
        System.out.println("Age is :"+a);
    }
    catch(Exception e){
        System.out.println("please enter age whichs is less than 110");
    }

}

}