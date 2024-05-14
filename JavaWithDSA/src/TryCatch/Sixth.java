package TryCatch;

public class Sixth {
    public static void main(String[] args) {
        try{
            System.out.println(100/0);
            int[] a= {10,20,30,40};
            System.out.println(a[5]);
        }
        catch (ArithmeticException e){
            System.out.println("You can not divide by zero ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bounds........... ");
        }
        System.out.println("------------------Thank You------------------");
    }
}
