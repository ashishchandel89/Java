//randomacessfile . it can helps us to same to same as input output stream but it cna read te file line by line
import java.io.*;
class randomfile{
    protected randomfile(){
    }
    void display(final String s1){
        
    try{
        RandomAccessFile obj=new RandomAccessFile(s1,"r");
        long a=obj.length();    //we can takes the length of file into long a.
        
        System.out.println("File exist");
        System.out.println("the content of file is: ");
        long d=0;
        for(d=0;d<a;d++){
            String s=obj.readLine();    //line read hongior string s me store hongi
            System.out.println(s);  //string will be displayed here.
            d=obj.getFilePointer(); //now the pointer read a line and that line will be stored in d. and now pointer will be read next line
        }
    }
    catch(IOException e){
        System.out.println("File does not exist");
    }
}
}
public class a54{
   public static void main(String args[]){
    randomfile obj=new randomfile();
    obj.display("a2.java");
   }
}
