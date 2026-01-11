//array list in java.
import java.util.*;
class c1{
    ArrayList obj;
    List obj2;
    c1(){
        obj=new ArrayList();
        obj2=new ArrayList();
    }
    //adding elements to ArrayList.
    void add(){
    for(int a=0;a<5;a++){
        obj.add(new Integer(a));
    }
    obj.add("AASHSIH");
    obj.add("CHANDEL");
    obj.add("NIKHIL");
    obj.add("CHANDEL");
    System.out.println();
}
//displaying elements of ArrayList.
void display(){
    System.out.println("Retrive object from the arraylist");
    System.out.println();
    for(int a=0;a<obj.size();a++){
        System.out.println(" "+obj.get(a));
    }
        System.out.println();
}
//searching in the ArrayList.
void search(){
    System.out.println();
    System.out.println("Search of an object and return" + "the first position and last position");
    System.out.println();
    System.out.println("Fisrt occuarance string  (CHANDEL)  on that position: "+obj.indexOf("CHANDEL"));
    System.out.println("Last occuarance string  (CHANDEL)  on that position: "+obj.lastIndexOf("CHANDEL"));
    System.out.println();
}
void extract(){
    System.out.println("Extract a sublist and then print the new list: ");
    System.out.println();
    obj2=obj.subList(5,obj.size());
    System.out.println("New Sublist from index 5 to " +( obj.size()-1)+" is:"+obj2);
    System.out.println();

}
void shuffle(){
    System.out.println("shuffle the elements in some random order: ");
    System.out.println();
    System.out.println ("player list (before): " + obj);
    System.out.println();
    Collections.shuffle(obj,new Random());
    System.out.println("Player List (after) : "+obj);
}

}
public class a41 {
    public static void main(String args[]){
        c1 player_obj=new c1();
        player_obj.add();
        player_obj.display();
        player_obj.search();
        player_obj.extract();
        player_obj.shuffle();
    }
}
