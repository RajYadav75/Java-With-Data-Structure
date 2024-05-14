package JavaEightFeatures.SupplierInterface;

import java.util.function.Supplier;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(Math.random()); // it will provide any random value between 0 and 1
        System.out.println((int)(Math.random()*100));

        Supplier<Integer> s = () -> (int)(Math.random()*100);
        System.out.println(s.get());

        Supplier<String> ss = () -> {
            String[] names = {"Raj","Yash","Rahul","Deepak","Panther"};
            int i = (int)(Math.random()*4);
            return names[i];
        };
        System.out.println(ss.get());
    }
}
