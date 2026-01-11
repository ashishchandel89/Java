//map interfaces :- hashmap , storedmap , treemap
import java.util.*;
public class a46 {
    HashMap obj;
    a46(){
        obj=new HashMap();  //intialize hashmap when the object is create of class.
    }
    void f1(String[] word){
        for(int c=0;c<word.length;c++){
            String s1=word[c];
            Integer freq=(Integer)obj.get(s1);  //get frequency of the word.
            if(freq==null){
                freq=new Integer(1);
            }
            else{
                int v=freq.intValue();
                freq=new Integer(v+1);
            }
            obj.put(s1,freq);
            }
        }
            void display(){
                TreeMap obj2=new TreeMap(obj);
                System.out.println("Calculating frequency of words");
                System.out.println(obj2);
            }
    
       public static void main(String args[]){
        if(args.length<1){
            System.out.println("usage: java wordtest <sample string> ");
            System.exit(0);
        }
        a46 obj1=new a46();
        obj1.f1(args);
        obj1.display();
    }
}



/*explain all question :-
Class banayi hai – WordFrequencyCounter
Isme ek map use kiya gaya hai (HashMap) jisme word aur uski ginti (count) store hoti hai.

Constructor (WordFrequencyCounter)
Jab bhi object banta hai class ka, yeh HashMap ko initialize karta hai.

Method: countFrequencies(String[] words)

Jo words input mein mile hain, unko ek ek karke dekhta hai.

Agar word pehle se map mein hai, to uska count +1 kar deta hai.

Agar nahi hai, to uska count 1 se start karta hai.

Method: display()

HashMap ko TreeMap mein convert karta hai (taaki words sorted ho jayein).

Fir map ko print karta hai – jisme har word ke aage uski frequency hoti hai.

main() method

Sabse pehle check karta hai: kya input diye gaye hain ya nahi?

Agar nahi diye to ek message print karta hai ki program kaise chalana hai.

Agar diye hain:

Ek object banata hai.

Words ki counting karta hai (countFrequencies() call karke).

Fir result print karta hai (display() se).
 */