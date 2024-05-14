package MultiThreading.ThreadClassMethods;
class Phlaaa2 extends Thread{

    @Override
    public void run() {
        System.out.println("Is thread Interrupted first : "+ Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Hi : "+1);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Is thread Interrupted Second : "+ Thread.currentThread().isInterrupted());

    }
}
public class IsInterrupted {
    public static void main(String[] args) {
        Phlaaa2 ob = new Phlaaa2();
        ob.start();
        ob.interrupt();
    }
}