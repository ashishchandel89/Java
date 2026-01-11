import java.util.Scanner;
public class a25{
    public static void main(String args[]) {
    try{    
            int a;
            System.out.print("Enter User's Age: ");
            Scanner obj=new Scanner(System.in);
            a=obj.nextInt();
            a25 obj2=new a25();
            obj2.display(a);
    }
            catch(Exception e){
                System.out.println("please enter age less than 150");
            }
        
    
    }
    void display(int a) throws Exception{
        
        if(a>150) 
        throw new Exception();
        System.out.println("Age is :"+a);
         
    }
        
    

}



/*
ChatGPT said:
🔍 Code Ka Kya Kaam Hai?
User se age (umar) input lene ko kehta hai.

Agar user koi galat input deta hai (jaise abc), ya 150 se zyada age deta hai, to try-catch block use karke us error ko handle karta hai.

Agar sab kuch sahi ho to Age is: ... print karta hai.

❗ Problem Kya Hai Original Code Mein?
Aapka original code sirf ek hi catch block use karta hai, jo har tarah ke error ke liye ek hi message dikhata hai:

java
Copy
Edit
System.out.println("please enter age less than 150");
Agar user ne letters likh diye ("abc"), to bhi wahi message aayega — jo confuse kar sakta hai.

✅ Behtar Tarika — Alag-Alag Exception Handle Karna
java
Copy
Edit
=
💡 Key Concepts (Aasaan Bhasha Mein):
try block: Jahan hum wo code likhte hain jisme error ho sakta hai.

catch block: Jab error aaye, to usse kaise handle karein — yeh batata hai.

InputMismatchException: Jab user galat type ka input de (jaise number ke bajaye text).

throw new Exception(): Jab hum khud ek exception create karna chahein.
 */