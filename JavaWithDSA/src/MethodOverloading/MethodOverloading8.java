package MethodOverloading;

class Test7{
    void display(Object a){
        System.out.println("Object "+a);
    }
    void display(String a){
        System.out.println("String "+a);
    }
    void display(StringBuilder a){

        System.out.println("StringBuilder "+a);
    }

}
public class MethodOverloading8 {
    public static void main(String[] args) {
        Test7 t = new Test7();
//        t.display(null); error
        t.display("Deepak");
        t.display(new StringBuilder("Amit"));
        t.display(new Object());
    }
}

