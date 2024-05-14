package MultiThreading.ThrdClas;

public class Thread1 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread");
        }
    }
}
