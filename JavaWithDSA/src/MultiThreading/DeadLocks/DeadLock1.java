package MultiThreading.DeadLocks;
class Mythread1 extends Thread{
    Resource rs1, rs2;
    Mythread1(Resource rs1,Resource rs2){
        this.rs1 = rs1;
        this.rs2 = rs2;
    }
    @Override
    public void run() {
        synchronized (rs1)
        {
            System.out.println("Thread 1 has allocated resource 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            synchronized (rs2){
                System.out.println("Thread 1 has allocated resource 2");
            }
        }
    }
}

class Mythread2 extends Thread{
        Resource rs1, rs2;
        Mythread2(Resource rs1,Resource rs2){
            this.rs1 = rs1;
            this.rs2 = rs2;
        }
        @Override
        public void run() {
            synchronized (rs2)
            {
                System.out.println("Thread 2 has allocated resource 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                synchronized (rs1){
                    System.out.println("Thread 2 has allocated resource 1");
                }
            }
        }
}
class Resource{

}
public class DeadLock1 {
    public static void main(String[] args) {
        Resource rs1 = new Resource();
        Resource rs2 = new Resource();

        Mythread1 t1 = new Mythread1(rs1, rs2);
        Mythread2 t2 = new Mythread2(rs1, rs2);

        t1.start();
        t2.start();
    }
}
