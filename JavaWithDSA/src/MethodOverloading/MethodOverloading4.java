package MethodOverloading;

class Test3{
    void display(String a, int b){
        System.out.println("Phle string ");
        System.out.println("String part "+a+" int part -> "+b);
    }
    void display(int a, String b){
        System.out.println("phle int");
        System.out.println("int part "+a+" String part -> "+b);
    }

}
public class MethodOverloading4 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.display(8115, "Papa");
        t.display("Raj bhagwan",987);
    }
}

