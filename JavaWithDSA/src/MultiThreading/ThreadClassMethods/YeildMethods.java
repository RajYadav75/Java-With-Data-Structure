package MultiThreading.ThreadClassMethods;
class Phla extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}
public class YeildMethods {
    public static void main(String[] args) {
        Phla ob = new Phla();
        ob.start();
        Thread.yield();
        for (int i = 1; i < 11; i++) {
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}
