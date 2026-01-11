//outputstream
import java.io.*;
class outputfile{
    protected outputfile(){
    }
    void display(){
    byte[] obj=new byte[100];       //bytes me input lenge user se 
    try{
    System.out.print("Enter a line to be saved into the file:");
    int line=System.in.read(obj);  //user se input li byte ke object me. ab hamara new data line variable me store hai
    FileOutputStream obj2=new FileOutputStream("txt");  //write in file with fileoutputstream or obj2 bhi create ho gya 
    obj2.write(obj, 0 , line);     //0 se file me line add ho jaygi byte vale object me 
    System.out.println("UPDATED");  //update ho gya idir

    }
    catch(IOException e){
        System.out.println("ERROR in the creating file"+e);
    }
}
}
public class a51{
    public static void main(String args[]){
        outputfile obj=new outputfile();
        obj.display();
    }
}