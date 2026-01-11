//constructor overloading in java.
class c1{
    public c1(int a,int b){
        System.out.println("value of integer a:"+a);
        System.out.println("value of integer b:"+b);

    }
    public  c1(double c,double d){
        System.out.println("value of float a:"+c);
        System.out.println("value of float b:"+d);
    }
    public c1(char a,char b){
        System.out.println("value of character a:"+a);
        System.out.println("value of character b:"+b);
    }
    public c1(String m,String n){
        System.out.println("name of 1st person:"+m);
        System.out.println("name of 2nd person:"+n);
    }
}
public class a18 {
    public static void main(String args[]){
        c1 obj=new c1(10,20);
        c1 obj2=new c1(30.5,40.8);
        c1 obj3=new c1('b','t');
        c1 obj4=new c1("ashsih","ram");
    }
    
}
