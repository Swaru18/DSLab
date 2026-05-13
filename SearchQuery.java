import java.rmi.*;
import java.rmi.server.*;

public class SearchQuery extends UnicastRemoteObject implements Search {

    SearchQuery() throws RemoteException {}

    public String query(String s) throws RemoteException {
        return s.equals("Reflection in Java") ? "Found" : "Not Found";
    }
}