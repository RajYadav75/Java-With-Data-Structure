package JavaEightFeatures.Methodreference;
interface I1{
    void m1();
}
class A1{
    static void m2(){
        System.out.println("Hii");
    }
}
public class Main2 {
    public static void main(String[] args) {
        I1 i = A1::m2;
        i.m1();
    }
}
