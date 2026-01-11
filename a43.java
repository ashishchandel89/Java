import java.util.*;
class c1{
    Hashtable obj;
    c1(){
            obj=new Hashtable();
    }
    void add(){
            obj.put("Ashsih",new String("2001"));
            obj.put("mansih",new String("2002"));
            obj.put("Kartik",new String("2003"));
            obj.put("Ramesh",new String("2010"));
        
    }
    void display(){
        String s1="Ashsih";
        System.out.println("\nStudents name is: "+s1);
        String result=(String) obj.get(s1);
        System.out.println("Graduated in the year: "+result);
        Enumeration enumNames=obj.keys();
     }
}
public class a43{
    public static void main(String arg[]){
        c1 student_obj=new c1();
        student_obj.add();
        student_obj.display();
    }
}