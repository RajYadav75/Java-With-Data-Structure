package JavaEightFeatures.PredicateInterface;

interface I2{
    boolean test(int no);
}
public class Main2 {
    public static void main(String[] args) {
        I2 ob = no -> no % 2 == 0;
        boolean a = ob.test(15);
        System.out.println(a);
    }
}