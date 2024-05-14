package JavaEightFeatures.Lambdafunctions;

import Collection.ARRAY.ThreeD;

public class Main9 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hi i am child thread");
    }

    public static void main(String[] args) {
        Main9 ob = new Main9();
        Thread t = new Thread(ob);
        t.start();
        System.out.println("hi i am main thread");
    }
}
