//time and date in date class.
import java.util.Date;
class c1{
    Date obj;
    c1(){
        
        obj=new Date();
    }
    void display(){
        String str_date,str_time="";
        System.out.println("Today's Date: "+obj);
        long time;
        time=obj.getTime();
        System.out.println("Time in milliseconds since: "+ "Jan 1,1970(GMT):"+time);
        str_date=obj.toString();
        str_time=str_date.substring(11,(str_date.length()-4));
        str_time=" Time: "+str_time.substring(0,8);
        System.out.println(str_time);
    }
}
public class a39 {
 public static void main(String args[]){
    c1 obj=new c1();
    obj.display();

 }   
}
