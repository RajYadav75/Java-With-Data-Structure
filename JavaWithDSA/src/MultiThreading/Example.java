package MultiThreading;
class Ex extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class Example {
    public static void main(String[] args) {
        Ex ob = new Ex();
        ob.start();

        Ex ob1 = new Ex();
        ob1.start();
    }
}
