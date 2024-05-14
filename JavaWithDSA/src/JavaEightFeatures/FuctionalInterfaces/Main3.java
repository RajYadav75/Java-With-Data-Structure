package JavaEightFeatures.FuctionalInterfaces;
interface I3{
    void m1();
    default void m2(){

    }
    static void m3(){

    }

}
@FunctionalInterface
interface I4 extends I3
{

}
public class Main3 {
}
