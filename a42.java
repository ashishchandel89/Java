//linked list in java.
import java.util.*;
class c1{
    LinkedList obj;
    c1(){
        obj=new LinkedList();

    }
    void test(){
        System.out.println("Adding data objects in the queue: ");
        obj.addLast("Amit");
        obj.addLast("Ashish");
        obj.addLast("Aryen");
        obj.addLast("Arman");
       //System.out.println(obj.getLast());
      obj.removeLast();
      for(int a=0;a<obj.size();a++)
      {
        System.out.println(obj.get(a));
      }
    }
}
public class a42 {
    public static void main(String agrs[]){
       c1 queue_obj=new c1();
       queue_obj.test(); 
    }
    
}
