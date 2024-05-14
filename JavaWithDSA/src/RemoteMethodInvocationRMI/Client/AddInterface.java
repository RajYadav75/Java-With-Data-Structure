package RemoteMethodInvocationRMI.Client;

import java.rmi.*;

public interface AddInterface extends Remote {
    public  int add(int n1, int n2) throws RemoteException;
}