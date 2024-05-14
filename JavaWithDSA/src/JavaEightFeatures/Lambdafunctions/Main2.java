package JavaEightFeatures.Lambdafunctions;


interface I2{
    void m1();
}
public class Main2 {
    public static void main(String[] args) {
        I2 ob =new I2() {
            @Override
            public void m1() {
                System.out.println("I am m1 method");
            }
        };
        ob.m1();
    }
}