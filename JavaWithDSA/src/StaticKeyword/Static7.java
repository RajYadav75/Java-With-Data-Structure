package StaticKeyword;
class A{
    static {
        System.out.println("I am in static block class A");
    }
}
public class Static7 {
    static {
        System.out.println("I am in static block class Static7");
    }

    public static void main(String[] args) {
        A ob;  //this is reference create
        A ob1 = new A();  //this is object creation
        System.out.println("I am in main method ");
    }
}
