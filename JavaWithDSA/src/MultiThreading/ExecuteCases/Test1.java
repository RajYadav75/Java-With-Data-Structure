package MultiThreading.ExecuteCases;
//1. Performing Single task from Single Thread

class Mythread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Hi Raj : "+getName());
    }
}
public class Test1 {
    public static void main(String[] args) {
        Mythread1 ob = new Mythread1();
        ob.start();
    }
}
