package Interfaces;
interface I11{
    default void show(){
        System.out.println("I am default method");
    }
}
class Test2 implements I11{

}
public class Interface4 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.show();
    }
}