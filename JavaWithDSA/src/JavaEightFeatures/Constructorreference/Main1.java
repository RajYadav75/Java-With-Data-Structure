package JavaEightFeatures.Constructorreference;
interface I{
    void m1();
}
class A{
    A(){
        System.out.println("Constructor...!!!");
    }
}
public class Main1 {
    public static void main(String[] args) {
        I  i = A::new;
        i.m1();
    }
}
