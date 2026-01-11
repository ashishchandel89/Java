//methods of vector class
import java.util.*;
class a45{
    Vector obj;
    a45(){
        obj=new Vector();
    }
    void add(){
        obj.addElement("aman");
        obj.addElement("mohit");
        obj.addElement("amit");
        obj.addElement("raman");
    }
    void insert(){
        obj.insertElementAt("computer", 0);
        obj.insertElementAt("education",4);
    }
    void display(String s1){
        System.out.println(s1);
        int a=0;
        while(a<obj.size()){
            System.out.print(obj.elementAt(a));
            a++;
            if(a<obj.size()){
                System.out.print(", ");
            }
            System.out.println("\nSize: "+obj.size());
        }
    }
        void search(){
            System.out.println("Searching content : ");
            String s1="computer";
            if(obj.contains(s1)){
                System.out.println("found at index: "+obj.indexOf(s1));
            }
        }
        void remove(){
            obj.removeElement("education");
        }
        public static void main(String args[]){
            a45 obj1=new a45();
            obj1.add();
            obj1.display("displaying contents");
            obj1.insert();
            obj1.search();
        }
}
