package MultiThreading.ThreadClassMethods;
class Phlaaa4 extends Thread{

    @Override
    public void run() {
        System.out.println("Is thread Interrupted Second : "+ Thread.currentThread().isInterrupted());

        System.out.println("Is thread Interrupted first : "+ Thread.interrupted());
        System.out.println("Is thread Interrupted Second : "+ Thread.interrupted());


        System.out.println("Is thread Interrupted Second : "+ Thread.currentThread().isInterrupted());
        System.out.println("Is thread Interrupted Second : "+ Thread.currentThread().isInterrupted());


    }
}
public class InterruptedMethod1 {
    public static void main(String[] args) {
        Phlaaa4 ob = new Phlaaa4();
        ob.start();
        ob.interrupt();
    }
}