package MultiThreading.ExecuteCases;
//2. Performing Single task from Multiple Thread
class Mythread2 extends Thread{
    @Override
    public void run() {
        System.out.println("HI Raja : "+ getName());
    }
}
public class Test2 {
    public static void main(String[] args) {
        Mythread2 ob = new Mythread2();
        ob.start();

        Mythread2 ob1 = new Mythread2();
        ob1.start();
    }
}
