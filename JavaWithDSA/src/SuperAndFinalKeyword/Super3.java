package SuperAndFinalKeyword;
class Aaa{
    void show(){
        System.out.println("I am in class Aaa");
    }
}
class Bbb extends Aaa{
    void show(){
        super.show();
        System.out.println("I am in class Bbb");
    }
    void m1(){
        super.show();
    }
}
public class Super3 {
    public static void main(String[] args) {
        Bbb ob = new Bbb();
        ob.show();
        ob.m1();
    }
}
