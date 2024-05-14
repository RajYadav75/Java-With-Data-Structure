package MultiThreading.ThreadClassMethods;
class Myth1 extends Thread{
    @Override
    public void run() {
        System.out.println("Raj "+Thread.currentThread().getName());
    }
}
public class PriorityMethods1 {
    public static void main(String[] args) {
        Myth1 ob = new Myth1();
        ob.start();
        ob.setPriority(Thread.MAX_PRIORITY);
        System.out.println(ob.getPriority());
    }
}
