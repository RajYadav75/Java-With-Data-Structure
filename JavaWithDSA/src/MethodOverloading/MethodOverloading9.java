package MethodOverloading;
// THis program  is not method overloading because
class Test8{
    int display(String a){
        System.out.println("String "+a);
        return 0;
    }
    void display(int a){
        System.out.println("int "+a);
    }

}
public class MethodOverloading9 {
    public static void main(String[] args) {
        Test8 t = new Test8();
//        t.display(null); error
        t.display("Raj");
        t.display(10);
    }
}

