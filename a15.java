import java.util.Scanner;
public class a15{
    public static void main(String  args[]){
    int a,b,c;
    Scanner obj=new Scanner(System.in);
    System.out.print("enter first no: ");
    a=obj.nextInt();
    Scanner obj2=new Scanner(System.in);
    System.out.print("enter last no: ");
    b=obj2.nextInt();
    for(c=a;c<=b;c++)
    {
        System.out.println(" "+c);
    }
    }
}