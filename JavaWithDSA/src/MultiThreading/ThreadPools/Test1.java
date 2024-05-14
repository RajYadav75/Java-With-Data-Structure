package MultiThreading.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadTask1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Test1 {
    public static void main(String[] args) {
        MyThreadTask1 mt = new MyThreadTask1();
//        Thread t = new Thread(mt);
//        t.start();
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 1; i <=  5; i++) {
            es.submit(mt);
        }
        es.shutdown();
    }
}
