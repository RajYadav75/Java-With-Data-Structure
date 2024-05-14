package MultiThreading.Synchronizationss;
class BookTicket{
    static int total_seats = 10;
    static synchronized void bookTicket(int seats){
        if (total_seats >= 10){
            System.out.println("Success");
            total_seats -= seats;
            System.out.println("Seats left : "+total_seats);
        }else {
            System.err.println("Fail");
        }
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
public class StaticSynchronization {
    public static void main(String[] args) {
        BookTicket bt1 = new BookTicket();

        Tred ob = new Tred(bt1, 7);
        ob.start();

        Tred ob1 = new Tred(bt1, 4);
        ob1.start();

        BookTicket bt2 = new BookTicket();

        Tred1 ob2 = new Tred1(bt2, 5);
        ob2.start();

        Tred1 ob3 = new Tred1(bt2, 6);
        ob3.start();
    }
}
