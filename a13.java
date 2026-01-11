//accepting two no. and find odd no. b/w these no.
public class a13 {
    public static void main(String args[])
    {
        int a,b,c;
        b=Integer.parseInt(args[0]);
        c=Integer.parseInt(args[1]);
        for(a=b;a<=c;a++)
        {
        
            if(a%2==1)
            System.out.println("odd no: "+a);
                
        }
            
    }
}
    

