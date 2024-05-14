package MethodOverloading;

class Test5{
    void display(int a){
        System.out.println("First method "+a);
    }
    void display(int... a){
        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public class MethodOverloading6 {
    public static void main(String[] args) {
        Test5 t = new Test5();
//        t.display('d'); //promote into integer Ascii Value
        t.display(); // this is also correct
        t.display(10);
        t.display(20,30);
    }
}

