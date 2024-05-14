package JavaEightFeatures.FunctionInterface;

import java.util.function.Function;

public class Main1 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = sal -> sal*12;
        System.out.println(f.apply(10000)+" lpa");
        System.out.println(f.apply(40000)+" lpa");
    }
}
