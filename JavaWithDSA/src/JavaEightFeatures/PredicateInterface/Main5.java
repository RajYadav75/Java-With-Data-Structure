package JavaEightFeatures.PredicateInterface;

import java.util.function.Predicate;

public class Main5 {
    public static void main(String[] args) {
        Predicate<String> p1 = pass -> pass.length()> 6;
        Predicate<String> p2 = pass -> pass.equals("raj@123");
        System.out.println(p1.test("rajyadavji"));
        System.out.println(p2.test("raj@123"));
        Predicate p = p1.and(p2);
        System.out.println(p.test("raj@123"));
        Predicate pp = p1.or(p2);
        System.out.println(pp.test("rajyadava"));
    }
}
