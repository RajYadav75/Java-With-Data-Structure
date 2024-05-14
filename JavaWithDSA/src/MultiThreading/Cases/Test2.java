package MultiThreading.Cases;

class Abc2 extends Thread{
    public void run(){
        System.out.println("Hi Raj");  //this is also method that does not create thread
    }
}
public class Test2 {
    public static void main(String[] args) {
        Abc2 ob = new Abc2();
        ob.run();
    }
}
