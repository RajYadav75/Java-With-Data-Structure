package MultiThreading.Cases;

class Abc4 extends Thread{
    public void run(){
        System.out.println("Hi Raj");
    }
    public void run(int a){
        System.out.println(a);  // this is not create thread
    }
}
public class Test4 {
    public static void main(String[] args) {
        Abc4 ob = new Abc4();
        ob.start();

        ob.run(10);
    }
}