package MultiThreading.Cases;
class Abc1 extends Thread{
    public void run(){
        System.out.println("Hi Raj");   // this will create thread
    }
}
public class Test1 {
    public static void main(String[] args) {
        Abc1 ob = new Abc1();
        ob.start();
    }
}
