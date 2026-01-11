import java.util.Scanner;

class c1{
    public void display(String s2){
        int total=0,prev=0,curr;
        int n=s2.length();

        for(int i=n-1;i>=0;i--){
            curr=roman(s2.charAt(i));

            if(curr<prev){
                total=total-curr;
            }
            else{
                total=total+curr;
            }
            prev=curr;
        }
        System.out.println("In Integer: "+total);
    }
    public int roman(char ch){
        switch (ch) {
            case 'I':
        return 1;
        case 'V':
        return 5;
        case 'X':
        return 10;
        case 'L':
        return 50;
        case 'C':
        return 100;
        case 'D':
        return 500;
        case 'M':
        return 1000;
        default:
        return 0;
        }
    }
}
public class practice2{
    public static void main(String []args){
        String s1,s2;
        c1 obj=new c1();
        Scanner obj2=new Scanner (System.in);
        System.out.print("Enter Roman No: ");
         s1=obj2.nextLine();
         s2=s1.toUpperCase();
         obj.display(s2);

    }
}