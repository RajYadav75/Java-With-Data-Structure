package MultiThreading.ThreadLocals;
class Thread1 implements Runnable{
    ThreadLocal tl = new ThreadLocal();

    @Override
    public void run() {
        tl.set("Raj");
        System.out.println("Hi : "+tl.get());
        display();
    }
    void display(){
        System.out.println("Hi : "+tl.get());
        tl.remove();
        System.out.println("Hi : "+tl.get());
    }
}
public class Test1 {
    public static void main(String[] args) {
        Thread1 tt = new Thread1();
        Thread t = new Thread(tt);
        t.start();
    }
}
