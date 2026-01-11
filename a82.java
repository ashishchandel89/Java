//------------Create a Server Class------------
import java.rmi.*;
import java.rmi.server.*;

class a82 extends UnicastRemoteObject implements a81{
    public String message(String x) throws RemoteException{
        System.out.println(x);
        return "Welcome"+x;
    }

    // --------Constructor--------
    public a82() throws RemoteException{
        try{
            Naming.rebind("abc",this);
            System.out.println("Server is running");
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }


   public static void main(String[]args){
    try{
      a82 obj=new a82();
    }catch(Exception e){
        e.printStackTrace();
    }
   } 
}
