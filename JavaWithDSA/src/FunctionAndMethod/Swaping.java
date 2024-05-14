package Function_and_Method;

public class Swaping {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+" "+"b = "+ b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
