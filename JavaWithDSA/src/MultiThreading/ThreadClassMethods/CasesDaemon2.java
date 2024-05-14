package MultiThreading.ThreadClassMethods;
class Mythreads1 extends Thread{
    public void run() {
        System.out.println("Hi");
        System.out.println("Child : "+Thread.currentThread().isDaemon());
    }
}
public class CasesDaemon2{
    public static void main(String[] args) {
        Thread.currentThread().setDaemon(true); //this throw exception
        Mythreads1 dm = new Mythreads1();
        dm.setDaemon(true);
        dm.start();
        System.out.println("Main : "+Thread.currentThread().isDaemon());

    }
}
