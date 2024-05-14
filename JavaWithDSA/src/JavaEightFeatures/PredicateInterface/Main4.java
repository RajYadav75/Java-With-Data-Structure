package JavaEightFeatures.PredicateInterface;

import java.util.function.Predicate;

public class Main4 {
    public static void main(String[] args) {
        Predicate<String> p = str -> str.length()> 6;
        System.out.println(p.test("abc"));
        System.out.println(p.test("Raj-Narayan"));
    }
}