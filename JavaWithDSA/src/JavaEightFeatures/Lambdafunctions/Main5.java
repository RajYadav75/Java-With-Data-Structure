package JavaEightFeatures.Lambdafunctions;
interface I5{
    void m(int a);
//    void m(int a, int b);
}
public class Main5 {
    public static void main(String[] args) {
        I5 i = a -> System.out.println(a*a);
        i.m(20);

        /*I5 i = a,b ->System.out.println(a+b);
        i.m(10,20);
        that provide error
        */
    }
}
