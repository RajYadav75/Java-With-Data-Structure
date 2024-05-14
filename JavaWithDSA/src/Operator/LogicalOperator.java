import java.util.Scanner;

public class LogicalOperator {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = s.nextInt();
        System.out.println("Enter the Second Number : ");
        int b =s.nextInt();
        if(a == b){
            System.out.println(a);
        }
    }
}
