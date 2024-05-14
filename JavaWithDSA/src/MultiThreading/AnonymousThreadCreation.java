package MultiThreading;

public class AnonymousThreadCreation {
    public static void main(String[] args) {
        Thread t1 = new Thread()
        {
            @Override
            public void run() {
                for (int i = 1; i < 6; i++) {
                    System.out.println("Hi Raj : "+i);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 6; i++) {
                    System.out.println("Hello Raj : "+i);
                }
            }
        };
        t2.start();
    }
}
