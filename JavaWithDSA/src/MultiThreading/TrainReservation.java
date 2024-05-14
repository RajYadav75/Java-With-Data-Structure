package MultiThreading;
class BookTrainSeat {    // In this project data inconsistancy problem

    /*  Raj booked 5 seats successfully
        Total seats left : 5
        Bhagwan booked 4 seats successfully
        Total seats left : 1
        Deepak booked 3 seats successfully
        Total seats left : -2
     */

    int total_seats = 10;
    public void bookSeat(int seats, String name){
        if (total_seats >= seats){
            System.out.println(name+" booked "+seats+ " seats successfully");
            total_seats = total_seats - seats;
            System.out.println("Total seats left : "+total_seats);
        }
        else
        {
            System.err.println(name+" : Sorry....!! Seat not booked");
            System.err.println("Total seat lefts : "+total_seats);
        }
    }
}

class Threadss extends Thread{
    BookTrainSeat bts;
    int seats;
    public Threadss(BookTrainSeat bts, int seats){
        this.bts = bts;
        this.seats = seats;
    }

    @Override
    public void run() {
        bts.bookSeat(seats,Thread.currentThread().getName());
    }
}
public class TrainReservation {
    public static void main(String[] args) {
        BookTrainSeat bts = new BookTrainSeat();

        Threadss Raj = new Threadss(bts,5);
        Raj.setName("Raj");
        Raj.start();

        Threadss Deepak = new Threadss(bts,3);
        Deepak.setName("Deepak");
        Deepak.start();

        Threadss Bhagwan = new Threadss(bts, 4);
        Bhagwan.setName("Bhagwan");
        Bhagwan.start();
    }
}
