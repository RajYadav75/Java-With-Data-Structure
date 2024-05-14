package StaticKeyword;

public class Static6 {
    Static6(){

    }
    void m1(){

    }
    static {
        System.out.println("I am in static block");
    }

    public static void main(String[] args) {
        Static6 ob = new Static6();
        ob.m1();
        System.out.println("I am in main method");
    }
}
