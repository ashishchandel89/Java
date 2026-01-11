//  Thread. class 
public class a75 {
    public static void main(String args[]){
        Thread obj=Thread.currentThread();
        System.out.println("Current Thread:- "+obj);
        obj.setName("Demo Thread");
        System.out.println("After Changing the Name:- "+obj);
        
    }
    
}
