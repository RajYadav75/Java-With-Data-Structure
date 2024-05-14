package MultiThreading.ThrdClas;
class Mythread extends Thread{
    public void run(){
        System.out.println("Raj");
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
    }
}
/*
        1. inherits the "Thread" class.
		2. override the run method
		3. create an instance of the class
		4. start the thread
*/