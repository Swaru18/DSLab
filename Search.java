import java.rmi.*;

public interface Search extends Remote {
    String query(String s) throws RemoteException;
}