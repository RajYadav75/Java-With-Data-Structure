package TryCatch;

public class Fourth {
    public static void main(String[] args) {
        System.out.println("1");
        int a = 100, b = 0, c;
        try {
            System.out.println("2");
            c = a/b;
            System.out.println("3");
            System.out.println(c);
            System.out.println("4");
        }
        catch (Exception e){
            System.out.println("5");
            System.out.println("Pagal ho divide nhi kr skte Zero se ");
            System.out.println("6");
        }
        System.out.println("------------Raj is error for any one life----------------------");
    }
}
