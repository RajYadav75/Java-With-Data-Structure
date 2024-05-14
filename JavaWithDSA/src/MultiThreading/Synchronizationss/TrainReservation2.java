package MultiThreading.Synchronizationss;
class BookTrainSeat2 {

    int total_seats = 10;
     void bookSeat(int seats, String name){
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        synchronized (this){
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
}

class Threadss2 extends Thread{
    BookTrainSeat2 bts;
    int seats;
    public Threadss2(BookTrainSeat2 bts, int seats){
        this.bts = bts;
        this.seats = seats;
    }

    @Override
    public void run() {
        bts.bookSeat(seats,Thread.currentThread().getName());
    }
}
public class TrainReservation2 {
    public static void main(String[] args) {
        BookTrainSeat2 bts = new BookTrainSeat2();


        Threadss2 Raj = new Threadss2(bts,5);
        Raj.setName("Raj");
        Raj.start();

        Threadss2 Deepak = new Threadss2(bts,3);
        Deepak.setName("Deepak");
        Deepak.start();

        Threadss2 Bhagwan = new Threadss2(bts, 4);
        Bhagwan.setName("Bhagwan");
        Bhagwan.start();
    }
}
