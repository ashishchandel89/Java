//methods of properties class
import java.util.*;
class a44{
    Properties obj;
    a44(){
        obj=new Properties();
    }
    void add(){
        obj.put("name1","ashish");
        obj.put("name2","manish");
        obj.put("name3","mohit");
        obj.put("name3","shubham");
        obj.put("name4","amit");
        obj.put("name5","aryan");
    }
    void display(){
        System.out.println("-----displaying product list-----");
        obj.list(System.out);
        System.out.println("----Searching for a product----");
        String s1=obj.getProperty("aman","not present");
        if(s1.trim().equals("not present"))
        {
            System.out.println("aman does not exist in the prosuct list");
        }
        Properties obj2=new Properties();
        Enumeration obj3=obj.propertyNames();
        String strKey="";
        while(obj3.hasMoreElements()){
            strKey=(String) obj3.nextElement();
            obj2.setProperty(strKey,obj.getProperty(strKey));
        }
        System.out.println("----Displaying properties list----");
        obj2.list(System.out);
    }

public static void main(String args[])
{
    a44 obj1=new a44();
    obj1.add();
    obj1.display();
}
}