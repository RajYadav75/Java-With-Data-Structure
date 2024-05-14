package MultiThreading.ThreadClassMethods;

public class NameMethod {
    void divide(){
        int a = 100, b = 0, c;
        c = a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {
//        Thread.currentThread().setName("Raj");
        NameMethod nm = new NameMethod();
        nm.divide();
//        int a = 100, b = 0, c;
//        c = a/b;
//        System.out.println(c);
    }
}
