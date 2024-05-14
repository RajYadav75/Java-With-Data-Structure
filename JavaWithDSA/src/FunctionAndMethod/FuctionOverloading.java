public class FuctionOverloading {
    public static int sum (int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(sum(a, b, 4));
        System.out.println(sum(5.12f, 12.3f));
    }
}
