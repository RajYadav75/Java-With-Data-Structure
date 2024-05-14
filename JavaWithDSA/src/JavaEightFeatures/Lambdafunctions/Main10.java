package JavaEightFeatures.Lambdafunctions;

public class Main10{
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Hi i am child thread");
        } ;
        Main9 ob = new Main9();
        Thread t = new Thread(ob);
        t.start();
        System.out.println("hi i am main thread");
    }
}

