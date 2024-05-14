package JavaEightFeatures.Methodreference;

interface I2{
    void m1(String a);
}
class A2{
    static void m2(String  a){
        System.out.println("Hello : "+a);
    }
}
public class Main3 {
    public static void main(String[] args) {
        I2 i = A2::m2;
        i.m1("Raj");
    }
}