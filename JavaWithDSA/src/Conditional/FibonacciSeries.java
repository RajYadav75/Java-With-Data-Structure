package Conditional;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number1 = 0, number2 = 1;
        System.out.print(number1+" "+number2);
        for (int i = 1; i <= 10; i++) {
            int c = number1 + number2;
            System.out.print(" "+c);
            number1 = number2;
            number2 = c;
        }


    }
}
