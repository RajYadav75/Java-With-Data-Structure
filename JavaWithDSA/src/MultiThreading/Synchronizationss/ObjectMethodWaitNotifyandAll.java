package MultiThreading.Synchronizationss;

public class ObjectMethodWaitNotifyandAll {
    public static void main(String[] args) {
        ObjectMethodWaitNotifyandAll t = new ObjectMethodWaitNotifyandAll();
        try {
            t.notify();
            t.wait();
            t.notifyAll();
        }
       catch (Exception e){
           System.out.println(e);
       }
    }
}
