package MethodOverloading;

class Test2{
    void display(String a){
        System.out.println("String part "+a);
    }
    void display(int a){
        System.out.println("int part "+a);
    }

}
public class MethodOverloading3 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.display(8115);
        t.display("Raj bhagwan");
    }
}

