import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int income = s.nextInt();
        int tax;
        if (income<500000) {
            tax=0;
        }else if(income>=500000 && income > 900000){
            tax = (int)(income*0.2);
        }else{
            tax = (int)(income*0.3);
        }
        System.out.println("Income Tax is totally of your income : "+tax);
    }
}
