package MultiThreading.Synchronizationss;
class BookTrainSeat1 {

    int total_seats = 10;
    synchronized void bookSeat(int seats, String name){
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }



        if (total_seats >= seats){
            System.out.println(name+" booked "+seats+ " seats successfully");
            total_seats = total_seats - seats;
            System.out.println("Total seats left : "+total_seats);
        }
        else
        {
            System.err.println(name+" : Sorry....!! Seat not left");
            System.err.println("Total seat lefts : "+total_seats);
        }
    }
}

class Threadss1 extends Thread{
    BookTrainSeat1 bts;
    int seats;
    public Threadss1(BookTrainSeat1 bts, int seats){
        this.bts = bts;
        this.seats = seats;
    }

    @Override
    public void run() {
        bts.bookSeat(seats,Thread.currentThread().getName());
    }
}
public class TrainReservation1 {
    public static void main(String[] args) {
        BookTrainSeat1 bts = new BookTrainSeat1();


        Threadss1 Raj = new Threadss1(bts,5);
        Raj.setName("Raj");
        Raj.start();

        Threadss1 Deepak = new Threadss1(bts,3);
        Deepak.setName("Deepak");
        Deepak.start();

        Threadss1 Bhagwan = new Threadss1(bts, 4);
        Bhagwan.setName("Bhagwan");
        Bhagwan.start();
    }
}
