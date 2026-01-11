import java.util.Scanner;

public class practice {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a name: ");
        String s1=obj.nextLine();

        int n;
        n=s1.length();
        boolean isPalindrome=true;

        for(int i=0;i<n/2;i++){
            if(s1.charAt(i)!=s1.charAt(n-1-i))
            {
            isPalindrome=false; 
            }
            else{
                isPalindrome=true;
            }
            break;
        }
        if(isPalindrome){
            System.out.println("Yes, this string is Palindrome");
        }
        else 
        {
            System.out.println("No, this String is not Palindrome");
        }
    }
}
