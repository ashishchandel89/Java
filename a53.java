//convert string into byte and byte into buffer

import java.io.*;
import java.io.IOException;

class bufferinput{
    protected bufferinput(){

    }
    void display(){
        try{
            String s1="My Name is Ashish & Chandel";        //take a string
            System.out.println("Original string: "+s1);     //display originle string
            System.out.println("after replacing '&' with 'and': "); //replace karne ke bad & ki place par and
            byte [] obj=s1.getBytes();      // now we can convert string into bytes and strore into byte object  
            ByteArrayInputStream byteobj=new ByteArrayInputStream(obj);    //now we can implement arrayinputstream with object2 it means obj2=obj
            BufferedInputStream bufferobj=new BufferedInputStream(byteobj); //now we can convert byteobj into bufferobj
            int c;  //charcter
            boolean f=false; //flag
            while((c=bufferobj.read()) !=-1){ //now in c contains the buuferread charcter
            switch(c){
                case '&':
                if(!f){     //if flag is true matalb & milgya. !f ka matlab ha flag true hai.
                    bufferobj.mark(4);
                    f=true;
                }
                else{     // f hia to mtlb flag false hai.
                    f=false;
                }
                break;
                case ' ':
                if(f){
                    f=false;
                    bufferobj.reset();
                    System.out.print("and");
                }
                else{
                    System.out.print((char) c);
                }
                break;
                default:
                if(!f){
                    System.out.print((char) c);
                }
                break;
            }
            }
           
        }
        catch(IOException e){

        }
    }
}
public class a53 {
    public static void main(String [] args){
        bufferinput obj=new bufferinput();
        obj.display();
    }
}
