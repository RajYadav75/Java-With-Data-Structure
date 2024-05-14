package Conditional;
// 56 5^2 6^2
// 123 1^3 2^3 3^3
// Get no of Digits
//  Get indivisual digit
// multiply indivisual digit
// Sum all
public class ArmstrongNumber {
    public static void main(String[] args) {
        int no = 153;
        int temp  = no;
        int leng = 0;
        while (temp != 0){
            leng ++;
            temp /=10;
        }
//        System.out.println(leng);
        int temp2 = no;
        int rem;
        int sum = 0;
        while(temp2 != 0){
            rem = temp2 % 10;
//            System.out.println(rem);
            temp2 /= 10;
            int mul = 1;
            for (int i = 1; i <= leng; i++) {
                mul *= rem;
            }
//            System.out.println(mul);
            sum += mul;

        }
//        System.out.println(sum);
        if (no == sum){
            System.out.println("Number is Armstrong Number");
        }else {
            System.out.println("Number is not Armstrong Number");
        }

    }
}
