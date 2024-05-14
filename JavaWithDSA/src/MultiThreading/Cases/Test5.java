package MultiThreading.Cases;

class Abc5 extends Thread{
    // also create thread
}
public class Test5 {
    public static void main(String[] args) {
        Abc5 ob = new Abc5();
        ob.start();
    }
}