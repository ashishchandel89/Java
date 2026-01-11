//calender class.
import java.util.*;

class c1{
    Calendar obj;
    c1()
    {
        obj=Calendar.getInstance();
    }
    void display()
    {
        
        System.out.println("Date and time components: ");
        System.out.println("Month: "+obj.get(Calendar.MONTH));
        System.out.println("Day: "+obj.get(Calendar.DATE));
        System.out.println("Year: "+obj.get(Calendar.YEAR));
        System.out.println("Hour: "+obj.get(Calendar.HOUR));
        System.out.println("Minute: "+obj.get(Calendar.MINUTE));
        System.out.println("Second: "+obj.get(Calendar.SECOND));
        // Now, after adding 30 minutes.Then, display time and date.
        obj.add(Calendar.YEAR,50);
        Date obj2=obj.getTime();
        System.out.println("\nDate n Time after adding 50 minutes to "+"current time: \n");
        System.out.println(obj2);

    }
}
public class a40 {
    public static void main(String args[]){
        c1 obj=new c1();
        obj.display();
    }
    
}
