package MultiThreading.Synchronizationss;

import java.security.spec.ECField;

class TicketEarning extends Thread{
    int total_earning = 0;
    int ticket_price = 100;

    @Override
    public void run() {
        synchronized (this){
            for (int i = 1; i <= 10; i++) {
                total_earning += ticket_price;
            }
            this.notify();
        }
    }
}
public class TrainEarning {
    public static void main(String[] args) throws InterruptedException {
        TicketEarning te = new TicketEarning();
        te.start();

        synchronized (te){
            te.wait();
            System.out.println("Total Earning : "+ te.total_earning);
        }

    }
}
