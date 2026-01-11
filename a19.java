//static keyword,static data member.
class c1{
    static int a=100;
    static void display()
    {
        int b=a/5;
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
    }
    static int c=50;
    static void display2()
    {
        c=c+5;
        System.out.println("value of c: "+c);
    }
static{
    System.out.println("static function");
}
}

public class a19 {
    public static void main(String args[]){
        c1.display();
        c1.display2();
        c1.display2();
        c1.display2();
        c1.display2();
        c1.display2();
        c1.display2();
        c1.display2();
        c1.display2();
        c1.display2();
    }
}
