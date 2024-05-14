package SuperAndFinalKeyword;
class F{
    final void m1(){
        System.out.println("I am class F");
    }
}
class D extends F{
//    void m1(){   //'m1()' cannot override 'm1()' overridden method is final
//        System.out.println("I am class D");
//    }
}
public class FinalMethod1 {
    public static void main(String[] args) {
        F ob = new D();
        ob.m1();
    }
}
