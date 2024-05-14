package MultiThreading.CallableInterfaces;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Thread2 implements Callable{
    @Override
    public Object call() {
        int a = 10, b = 20;
        int c = a+b;

        return c;
    }
}
public class Test2 {
    public static void main(String[] args)throws Exception {
        Thread2 tt = new Thread2();
       ExecutorService es = Executors.newFixedThreadPool(3);
       Future f = es.submit(tt);
        System.out.println(f.get());
        es.shutdown();
    }
}
