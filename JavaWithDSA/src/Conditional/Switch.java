import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a =5, b=4;
        Scanner sc =new Scanner(System.in);
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid ");
        }
    }
}
