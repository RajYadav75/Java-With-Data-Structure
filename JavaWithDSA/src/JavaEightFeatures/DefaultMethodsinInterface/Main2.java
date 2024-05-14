package JavaEightFeatures.DefaultMethodsinInterface;
interface I2{
    default void m1(){

    }
    default void m2(){

    }
}
public class Main2 implements I2 {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    public static void main(String[] args) {

    }
}
