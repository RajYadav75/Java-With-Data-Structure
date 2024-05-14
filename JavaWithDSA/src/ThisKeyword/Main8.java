package ThisKeyword;
class Test2{
    Test2(){
        System.out.println("1");
    }
    void m1(){
        Xyz ob = new Xyz(this);
    }
}
class Xyz{
    Xyz(Test2 t){
        System.out.println(t);
    }
}
public class Main8 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.m1();
    }
}
