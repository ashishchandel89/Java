import java.net.*;

public class a84 {
    public static void main(String args[]){
        try{
            if(args.length>0){
                String host=args[0];
                InetAddress[] address_obj= InetAddress.getAllByName(host);           
                for(int i=0;i<address_obj.length;i++){
                    System.out.println("Address: "+address_obj[i]);
                }
            }
            else{
                InetAddress local= InetAddress.getLocalHost();
                System.out.println("LocalAddress: "+local);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
