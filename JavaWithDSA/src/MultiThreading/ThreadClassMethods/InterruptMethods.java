package MultiThreading.ThreadClassMethods;
class Phlaaa extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Hi : "+1);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class InterruptMethods {
    public static void main(String[] args) {
        Phlaaa ob = new Phlaaa();
        ob.start();

        ob.interrupt();
    }
}
