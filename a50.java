//byte array stream. it is used to create an input stream using an array of an bytes. isme iternal counter hota hai jo next byte track rakhti hai.
import java.io.*;
class byteinput{
    protected byteinput(){

    }
    void display(){
        String s1="My Name is Aashish Chandel";
        byte[] obj=s1.getBytes();
        ByteArrayInputStream obj2=new ByteArrayInputStream(obj, 0 , 67);
        int w;
        for(int a=0;a<=5;a++){
        while((w=obj2.read()) !=-1){
            System.out.print((char)w);
        }
        System.out.println();
        obj2.reset();
        w=0;
        while((w=obj2.read())!=-1) {
            System.out.print((char)w);
            
        }
        }
    }
}
public class a50 {
    public static void main(String args[]){
        byteinput obj=new byteinput();
        obj.display();
    }
}
