package RemoteMethodInvocationRMI.Server;

import java.rmi.Naming;

public class Servers {
    public static void main(String[] args) {
        try{
            AddImplClass obj = new AddImplClass();
            Naming.rebind("rmi://192.168.194.253:1111/aaa",obj);
            System.out.println("Server Started ");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
