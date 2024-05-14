package MultiThreading.ExecuteCases;
// 4. Performing Multiple task from Multiple Thread
class Mythread4 extends Thread{
    @Override
    public void run() {
        System.out.println("Hi Raj "+getName());
    }
}
class Mythread41 extends Thread{
    @Override
    public void run() {
        System.out.println("Hi Raj "+getName());
    }
}
class Mythread42 extends Thread{
    @Override
    public void run() {
        System.out.println("Hi Raj "+getName());
    }
}
class Mythread43 extends Thread{
    @Override
    public void run() {
        System.out.println("Hi Raj "+getName());
    }
}
public class Test4 {
    public static void main(String[] args) {
        Mythread4 ob = new Mythread4();
        ob.start();
        Mythread41 ob1 = new Mythread41();
        ob1.start();
        Mythread42 ob2 = new Mythread42();
        ob2.start();
        Mythread43 ob3 = new Mythread43();
        ob3.start();
    }
}
