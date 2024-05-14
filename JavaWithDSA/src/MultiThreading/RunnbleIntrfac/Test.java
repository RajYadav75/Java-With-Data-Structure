package MultiThreading.RunnbleIntrfac;
class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++){
            System.out.println("Child thread : "+ i);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        Thread t = new Thread(mt1);
        t.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("Main thread : "+i);
        }
    }
}
