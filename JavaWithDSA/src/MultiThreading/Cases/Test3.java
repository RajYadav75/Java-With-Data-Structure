package MultiThreading.Cases;

class Abc3 extends Thread{
    public void start(){
        System.out.println("Hi Raj");  // this is simple method not thread
    }
}
public class Test3 {
    public static void main(String[] args) {
        Abc3 ob = new Abc3();
        ob.start();
    }
}
