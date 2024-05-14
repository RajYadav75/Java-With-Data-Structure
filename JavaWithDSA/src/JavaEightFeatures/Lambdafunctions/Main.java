package JavaEightFeatures.Lambdafunctions;
interface I1{
    void m1();
}
class A implements I1{
    @Override
    public void m1() {
        System.out.println("I am in m1 method");
    }
}
public class Main {
    public static void main(String[] args) {
        A ob = new A();
        ob.m1();
    }
}
