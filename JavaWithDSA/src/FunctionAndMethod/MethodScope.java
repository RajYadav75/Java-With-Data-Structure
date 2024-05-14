package Function_and_Method;

public class MethodScope {
    public static void main(String[] args) {
        int p = 10; //Method Scope
        {
            int s = 45; // Block Scope
            System.out.println(p);
        }
//        System.out.println(s);
        System.out.println(p);
    }
}
