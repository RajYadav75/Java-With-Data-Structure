package RemoteMethodInvocationRMI.Client;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Clients {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.194.253",1111);
            AddInterface ai = (AddInterface) Naming.lookup("aaa");
            System.out.println(ai.add(100,200));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
