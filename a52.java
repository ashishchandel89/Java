//byte array output stream

import java.io.ByteArrayOutputStream;
import java.io.IOError;
import java.io.IOException;

class byteoutput{
    protected byteoutput(){

    }
    void display(){
        String s1="My Name is Ashish Chandel";  //string me name liya
        byte[] obj=s1.getBytes();   //ab us string ko byte me store kara
        try{
            ByteArrayOutputStream obj2=new ByteArrayOutputStream(); //object banaya bytearrayoutput class ka
            obj2.write(obj);    //obj2 matlb bytearrayoutputstream ke object me write kar dia byte obj mtlb string
            System.out.println("writing the content of bytearrayoutputstream in the file:");
            System.out.println(obj2.toString());    //obj2 vali string display krrwa di
        }
    catch(IOException e){
        System.out.println("ERROR creating file");
    }
    }
}
public class a52{
    public static void main(String args[]){
        byteoutput obj=new byteoutput();
        obj.display();
    }
}