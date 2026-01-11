import java.net.*;
import java.io.*;
import java.util.*;

public class a86 {
    public static void main(String args[]){
        try{
        URL obj=new URL("http://localhost:8080/ashish/index.html");
        URLConnection con=obj.openConnection();
        System.out.println("DATE: "+new Date(con.getDate()));
        System.out.println("Content Type: "+con.getContentType());
        System.out.println("Last Modified: "+new Date(con.getLastModified()));
        System.out.println("Content Length: "+con.getContentLength());
        BufferedReader bf_obj=new BufferedReader(new InputStreamReader(obj.openStream()));
        String input;
        
        while((input=bf_obj.readLine())!=null){
            System.out.println(input);
           
        }
        bf_obj.close();
    }catch(Exception e){
        e.printStackTrace();
    }
        
    }
    
}
