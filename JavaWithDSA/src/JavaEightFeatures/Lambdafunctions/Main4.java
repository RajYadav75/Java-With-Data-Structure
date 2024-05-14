package JavaEightFeatures.Lambdafunctions;
interface I4{
    void m(int a);
}
public class Main4 {
    public static void main(String[] args) {
        I4 i = (int a) -> System.out.println(a*a);
        i.m(20);

        I4 ii = (a) -> {
            int res = a*a;
            System.out.println(res);
        };
        ii.m(41);
    }
}
