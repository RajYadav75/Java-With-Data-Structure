package Interfaces;
interface I111{
    static void show(){
        System.out.println("I am static method");
    }
}
class Test21 implements I111{

}
public class Interface5 {
    public static void main(String[] args) {
        I111.show();
    }
}