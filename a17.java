//function overloading in java.
class c1{
    public void display(int a,int b)
    {
    
        System.out.println("the value of a: "+a);
        System.out.println("the value of b: "+b);
    }
    public void display(double c,double d)
    {
    
        System.out.println("the value of c: "+c);
        System.out.println("the value of d: "+d);
    }
}
public class a17{
    public static void main(String args[]) {
        c1 obj=new c1();
        obj.display(10,20);
        obj.display(30.5,40.8);
        
    }

}