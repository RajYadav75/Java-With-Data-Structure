package TryCatch;

public class Fifth {
    public static void main(String[] args) {
        try{
            System.out.println(100/2);
            int[] a= {10,20,30,40};
            System.out.println(a[5]);
        }
        catch (Exception e){
            System.out.println("You can not divide by zero ");
            System.out.println("Array Index out of bounds........... ");
        }
        System.out.println("------------------Thank You------------------");
    }
}
