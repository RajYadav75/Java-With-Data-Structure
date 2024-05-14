package StaticKeyword;

public class Static9 {
    static {
        System.out.println("I am in static block in main method 1");
    }
    public static void main(String[] args) {
        System.out.println("I am in main method");
    }
    static {
        System.out.println("I am in static block in main method 2");
    }
}
