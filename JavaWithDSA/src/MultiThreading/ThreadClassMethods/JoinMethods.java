package MultiThreading.ThreadClassMethods;
class Phlaa extends Thread{
    @Override
    public void run() {
        try {
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
public class JoinMethods {
    public static void main(String[] args) {
        Phlaa ob = new Phlaa();
        ob.start();
        try {
            ob.join(); // this line will be executed by main thread, thus main thread will wait for another thread(Thread-0) to complete its tasks.
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
