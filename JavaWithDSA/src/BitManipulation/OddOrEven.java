package Bit_Manupulation;

public class OddOrEven {
    public static void oddEven(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0){
            //Even
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddEven(8);
        oddEven(3);
        oddEven(5);
    }
}
