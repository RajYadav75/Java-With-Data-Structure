package MultiThreading.ThreadClassMethods;
class Phlaaa3 extends Thread{

    @Override
    public void run() {
        System.out.println("Is thread Interrupted first : "+ Thread.interrupted()); // yha true print krega but turant interrupt status false kr dega
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Hi : "+1);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Is thread Interrupted Second : "+ Thread.interrupted());

    }
}
public class InterruptedMethod {
    public static void main(String[] args) {
        Phlaaa3 ob = new Phlaaa3();
        ob.start();
        ob.interrupt();
    }
}