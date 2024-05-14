package MultiThreading;
class Thrd extends Thread{
    @Override
    public void run() {
        System.out.println("Hi Raj");
    }
}
public class LifeCycle {
    public static void main(String[] args) {
        Thrd ob = new Thrd();
        ob.start();
    }
}
