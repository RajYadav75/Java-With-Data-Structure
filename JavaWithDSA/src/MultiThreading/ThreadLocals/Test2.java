package MultiThreading.ThreadLocals;
class Thread2 implements Runnable{
    ThreadLocal tl;
    public Thread2(ThreadLocal tl){
        this.tl = tl;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" : "+tl.get());
    }
}
public class Test2 {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal();
        tl.set(100);
        System.out.println(Thread.currentThread().getName()+" : "+tl.get());
        Thread2 tt = new Thread2(tl);
        Thread t = new Thread(tt);
        t.start();
    }
}
