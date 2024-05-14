package Bit_Manupulation;

public class Operation {
    public static int getIthBit(int n, int i){
        int bitmask = 1 << i;
        if ((n & bitmask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1 << i);
        return  n & bitmask;
    }
    public static int updateIthBit(int n, int i, int newbit){
        int bitmask = newbit << i;
        if(newbit == 0){
            return clearIthBit(n, i);
        }else {
            n = clearIthBit(n,1);
            return setIthBit(n,i);
        }
    }
    public static int clearIbits(int n, int i){
        int bitmask = (~0)<< i;
        return n&bitmask;
    }
    public static int clearRangeBits(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitmask = a|b;
        return  n & bitmask;
    }
    public static boolean isPowerOfTwo(int n){
        return  (n &( n - 1)) == 0;
    }
    public static int countSetBit(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static int fastExpo(int a, int n){
        int ans  = 1;
        while (n > 0){
            if((n & 1) != 0){ //check LSB
                ans *= a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearIbits(15,2));
        System.out.println(clearRangeBits(10,2,4));
        System.out.println(isPowerOfTwo(8));
        System.out.println(countSetBit(16));
        System.out.println(fastExpo(3,5));
    }
}
