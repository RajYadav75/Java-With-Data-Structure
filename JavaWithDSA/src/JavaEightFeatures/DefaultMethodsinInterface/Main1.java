package JavaEightFeatures.DefaultMethodsinInterface;
interface I1{
    void m1();
    default void m2(){

    };
}
public class Main1 implements I1
{
    public static void main(String[] args)
    {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}
