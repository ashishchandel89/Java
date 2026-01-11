//inputstream class revision
import java.io.*;
class inputfile{
    protected inputfile(){

    }
    void display(final String s1){
        try{
            int size;
            InputStream obj=new FileInputStream(s1);
            System.out.println("BYtes to be read in the file: "+(size=obj.available()));
            char[] obj2=new char[1000];
            for(int c=0;c<size;c++){
                obj2[c]=((char) obj.read());
                System.out.print(obj2[c]);
            }
        }
        catch(IOException e){
            System.out.println("File must not be found"+e);
        }
    }
}
public class input{
    public static void main(String []args){
        inputfile obj=new inputfile();
        obj.display("a38.java");
    }
}