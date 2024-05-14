package MultiThreading.ThreadClassMethods;

public class DaemonMethodss extends Thread{
    @Override
    public void run() {
        System.out.println("Hi");
        System.out.println("Child : "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DaemonMethodss dm = new DaemonMethodss();
        dm.start();
        System.out.println("Main : "+Thread.currentThread().isDaemon());

    }
}
