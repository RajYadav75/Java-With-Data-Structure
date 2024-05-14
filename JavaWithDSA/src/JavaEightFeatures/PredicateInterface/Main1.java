package JavaEightFeatures.PredicateInterface;
interface I1{
    boolean test(int no);
}
class A implements I1{
    @Override
    public boolean test(int no) {
        return no%2 == 0;
    }
}
public class Main1 {
    public static void main(String[] args) {
        I1 ob = new A();
        boolean a = ob.test(14);
        System.out.println(a);
    }
}
