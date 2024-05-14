package TryCatch;

public class Second {
    public static void main(String[] args) {
        int a = 100, b = 0, c;
        try {
            c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Pagal ho divide nhi kr skte Zero se ");
        }
        System.out.println("------------Raj is error for any one life----------------------");
    }
}
