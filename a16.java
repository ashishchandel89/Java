//how to call a function in java.
class c1{
        private void display()
        {
            System.out.println("1st function");
        }
        public void display2()
        {
            System.out.println("2nd function");
        }
}
public class a16{
public static void main(String args[]) {
    c1 obj=new c1();
    obj.display(); //it shows error, because display function is private.
    obj.display2();

}
}