import java.net.*;
public class a85 {
    public static void main(String args[]) throws MalformedURLException{
        URL obj=new URL("http://localhost:8080/ashish/a7.php");
        System.out.println("Protocol: "+obj.getProtocol());
        System.out.println("Port: "+obj.getPort());
        System.out.println("Host: "+obj.getHost());
        System.out.println("File: "+obj.getFile());
    }
}
