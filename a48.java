//file handling;
import java.io.*;
import java.sql.Date;
class file{
    protected file(){
        //constructor
    }
    void display(){
    File obj=new File("d:\\java5\\a2.java");//give here any file name
    System.out.println("File name: "+obj.getName());// it show name of file
    System.out.println("path of file: "+obj.getPath());//it show  d drive and file
    System.out.println("file last modified: "+new Date(obj.lastModified())); //it shows last date in its file would be modify
    System.out.println("parent directory: "+obj.getParent());// it shows parent of file means folder
    System.out.println("length of file: "+obj.length()); //it shows size of file

    }
}
public class a48{
public static void main(String args[]){
    file obj=new file();
    obj.display();
}
}
