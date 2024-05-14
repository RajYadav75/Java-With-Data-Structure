package MultiThreading.ThreadClassMethods;
class Myth extends Thread{
    @Override
    public void run() {
        System.out.println("Raj "+Thread.currentThread().getName());
        System.out.println("Child Thread Priority : "+Thread.currentThread().getPriority());
    }
}
public class PriorityMethods {
    public static void main(String[] args) {
        Myth ob = new Myth();
        ob.start();
        ob.setPriority(8);
        Thread.currentThread().setPriority(10);
        System.out.println("Rajaa "+Thread.currentThread().getName());
        System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());
    }
}
