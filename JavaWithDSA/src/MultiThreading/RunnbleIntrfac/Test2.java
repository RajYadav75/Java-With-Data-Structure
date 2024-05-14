package MultiThreading.RunnbleIntrfac;
class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++){
            System.out.println("Child thread : "+ i);
        }
    }
    void show(){
        System.out.println("Hi Raj");  // this task is done by main thread
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        Thread t = new Thread(mt1);
        t.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("Main thread : "+i);
        }
        mt1.show();
    }
}
