package MultiThreading.DeadLocks.LockInterfaces;

import java.util.concurrent.locks.ReentrantLock;

class BookTicket{
    ReentrantLock re = new ReentrantLock();
     int total_seats = 10;
      void bookTicket(int seats){
            re.lock();
            if (total_seats >= 10){
                System.out.println("Success");
                total_seats -= seats;
                System.out.println("Seats left : "+total_seats);
            }else {
                System.err.println("Fail");
            }

             try {
                 System.out.println("==========================");
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             m1();
     }
     void m1(){
         System.out.println("Nihilistic");
         re.unlock();
     }
}
class Tred extends Thread{
    BookTicket bt;
    int seats;
    Tred(BookTicket bt, int seats){
        this.bt = bt;
        this.seats = seats;
    }
    @Override
    public void run() {
        bt.bookTicket(seats);
    }
}
class Tred1 extends Thread{
    BookTicket bt;
    int seats;
    Tred1(BookTicket bt, int seats){
        this.bt = bt;
        this.seats = seats;
    }
    @Override
    public void run() {
        bt.bookTicket(seats);
    }
}
public class LockInterf1 {
    public static void main(String[] args) {
        BookTicket bt1 = new BookTicket();

        Tred ob = new Tred(bt1, 7);
        ob.start();

        Tred ob1 = new Tred(bt1, 4);
        ob1.start();
    }
}


