package Genericks.GenericksClass;

public class Main1 {
    public static void main(String[] args) {
        A ob = new A("Raj Yadav is great");
        ob.show();
//        A ob1 = new A(100);
//        ob1.show();
    }
}
class A{
    String a;
    A(String a){
        this.a = a;
    }
    void show(){
        System.out.println(a);
    }
}
