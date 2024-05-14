package JavaEightFeatures.StaticMethodsinInterface;
interface I1{
    void m1();
    static void m2(){
        System.out.println("I am static");
    }
}
class A1 implements I1{

    @Override
    public void m1() {
        System.out.println("I am override");
    }
    static void m2(){
        System.out.println("I am static but not override i am different");
    }
}
public class Main1 {
    public static void main(String[] args) {
        I1.m2();
    }
}
