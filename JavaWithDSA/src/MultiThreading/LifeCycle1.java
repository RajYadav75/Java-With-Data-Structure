package MultiThreading;
class Thrd1 extends Thread{
    @Override
    public void run() {
        System.out.println("Hi Raj");
    }
}
public class LifeCycle1 {
    public static void main(String[] args) {
        Thrd1 ob = new Thrd1();
        ob.start();
        ob.start(); // It will provide an exception because we cannot start one thread 2 times.
    }
}
