package MultiThreading.ThreadClassMethods;
class TakeAdmisn extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Admisn Starts");
            Thread.sleep(3000);
            System.out.println("You have taken the admisn successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class DepositFee extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Depositing Fees");
            Thread.sleep(1000);
            System.out.println("You have deposit the fees successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class TakeRollno extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Take roll no");
            Thread.sleep(5000);
            System.out.println("Now you can sit in exams.........");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class JoinMethods2 {
    public static void main(String[] args) throws InterruptedException {
        TakeAdmisn ta = new TakeAdmisn();
        ta.start();
        ta.join();

        DepositFee df = new DepositFee();
        df.start();
        df.join();

        TakeRollno tr = new TakeRollno();
        tr.start();
    }
}
