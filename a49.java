//inputstream class means we can read the file
import java.io.*;

class inputfile{
    protected inputfile(){
}
    void display(final String s1)
    {
    try{
        int a;//size
        InputStream obj=new FileInputStream(s1);
        System.out.println("Bytes avliable to read: "+(a=obj.available()));//now a can have size which inputstream can to be read.
        char[] obj2=new char[2000];                     //we have to read charcter's.so, we can make a char object of charctar class.
        int c;                                          //count for loop
        for(c=0;c<a;c++){                               //because we have to read the file line by line untill the file's size.
            obj2[c]=((char) obj.read());                //now obj2[c] means our inputstream will read charctaer . and (obj.read) is used to read with inputstream.because obj is the object ofinpustream.
           System.out.print (obj2[c]);                  // now diplay all read lines .
        }
        System.out.println("");
        obj.close();                                    //now object of inputstream will be close . it can stop the reading the file
    }
    catch(IOException e){
    System.out.println("file must not be found"+e);
    }
}
}

public class a49 {
    public static void main(String args[]){
        inputfile obj=new inputfile();
        obj.display("a48.java");                      //we can give file name which is used to read.
    }
    
}
