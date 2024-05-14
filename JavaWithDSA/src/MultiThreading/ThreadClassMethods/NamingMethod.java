package MultiThreading.ThreadClassMethods;

public class NamingMethod extends Thread{
    @Override
    public void run() {
        System.out.println("Hi Raj");
        System.out.println("Old child Thread Name "+Thread.currentThread().getName());
        Thread.currentThread().setName("My new Child Thread ");
        System.out.println("New child Thread Name "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        NamingMethod nm = new NamingMethod();
        nm.start();
        System.out.println("Old Main Thread Name "+Thread.currentThread().getName());
        Thread.currentThread().setName("My main Thread");
        System.out.println("Name Main Thread Name "+Thread.currentThread().getName());
    }
}
