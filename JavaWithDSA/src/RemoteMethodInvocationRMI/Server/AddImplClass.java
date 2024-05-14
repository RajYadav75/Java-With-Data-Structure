package RemoteMethodInvocationRMI.Server;

import java.rmi.RemoteException;
import java.rmi.server.*;

public class AddImplClass extends UnicastRemoteObject implements AddInterface {

    protected AddImplClass() throws RemoteException {
        super();
    }

    @Override
    public int add(int n1, int n2) throws RemoteException {
        return n1+n2;
    }
}
