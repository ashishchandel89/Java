//-----------Create the Remote Interface------------
import java.rmi.*;

public interface a81 extends Remote
{

   String message(String a) throws RemoteException;

}