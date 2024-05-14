package MultiThreading.ThreadClassMethods;
class Phlaa1 extends Thread{
    Thread t;
    Phlaa1(Thread t){
        this.t = t;
    }
    @Override
    public void run() {
        try {
            t.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class JoinMethods1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Phlaa1 ob = new Phlaa1(t);
        ob.start();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
