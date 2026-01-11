//prime no
public class a14 {
    public static void main(String args[])
    {
        int a,b,c=0;
        a=Integer.parseInt(args[0]);
        for(b=2;b<=a-1;b++)
        {
            if(a%b==0)
            {
            c=1;
            break;
            }
            
        }
        if(c==0)
        System.out.println("prime no");
        else 
        System.out.println("not prime");
    }
}
