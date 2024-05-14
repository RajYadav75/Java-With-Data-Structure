package MultiThreading.ThreadClassMethods;
class Phlaaa1 extends Thread{
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
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Hello : "+1);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class InterruptMethods1 {
    public static void main(String[] args) {
        Phlaaa1 ob = new Phlaaa1();
        ob.start();

        ob.interrupt();
//        ob.interrupt();  it does not work for any other statement
    }
}
