package MultiThreading.ThreadClassMethods;
class Mythreads extends Thread{
    public void run() {
        System.out.println("Hi");
        System.out.println("Child : "+Thread.currentThread().isDaemon());
    }
}
public class CasesDaemon{
    public static void main(String[] args) {
        Mythreads dm = new Mythreads();
        dm.setDaemon(true);
        dm.start();
//        dm.setDaemon(true);  // this is error
        System.out.println("Main : "+Thread.currentThread().isDaemon());

    }
}
