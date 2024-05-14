package ThisKeyword;
class Test1{
    void m1(){
        System.out.println("1");
        m2(this);
    }
    void m2(Test1 t){
        System.out.println(t);
    }
}
public class Main7 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.m1();
    }
}
