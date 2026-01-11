
// S O C K E T  ---  C L A S S

import java.net.*;
import java.io.*;

public class a87{
    Socket sk1;
    BufferedReader bf1;
    PrintWriter pw1;

    public a87(String host,int port) throws UnknownHostException,IOException{
        this.sk1 = new Socket(host, port);
        bf1 = new BufferedReader(new InputStreamReader(sk1.getInputStream()));
        pw1 = new PrintWriter(sk1.getOutputStream(), true); 
    }

    public a87(Socket s) throws UnknownHostException,IOException{

        sk1=s;
        bf1=new BufferedReader( new InputStreamReader(sk1.getInputStream()));
        pw1=new PrintWriter(sk1.getOutputStream(),true);

        }


        public Socket getSocket(){
            return sk1;
        }
        public void close() throws IOException{
            sk1.close();
        }
        public String readLine() throws IOException{
            return bf1.readLine();
        }
        public void println(String s) throws IOException{
            pw1.println(s);
        }

        public static void main(String [] args){

        }
    }




