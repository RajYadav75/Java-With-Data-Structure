package MultiThreading.ThreadClassMethods;
class Thred extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
public class SleepMethod {
    public static void main(String[] args) {
        Thred ob =new Thred();
        ob.start();
    }
}
