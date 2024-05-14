package JavaEightFeatures.FuctionalInterfaces;

interface I5{
    void m1();
    default void m2(){

    }
    static void m3(){

    }

}

interface I6 extends I5
{
    void m2();
}
public class Main4 {
}
