package JavaEightFeatures.PredicateInterface;

import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {
        Predicate<Integer> ob = no -> no % 2 == 0;
        boolean a = ob.test(15);
        System.out.println(a);
    }
}
