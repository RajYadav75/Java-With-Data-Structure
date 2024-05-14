package JavaEightFeatures.Methodreference;
interface I{
    void m1();
}
class A{
    void m2(){
        System.out.println("I am m2() method in class A but called by m1 method this is happening");
    }
}
public class Main1 {
    public static void main(String[] args) {
        A ob = new A();
        I i = ob :: m2;
        i.m1();
    }
}
