package MethodOverloading;

class Test6{
    void display(Object a){
        System.out.println("Object "+a);
    }
    void display(String a){
        System.out.println("String "+a);
    }
}
public class MethodOverloading7 {
    public static void main(String[] args) {
        Test6 t = new Test6();
        t.display(null);
    }
}

