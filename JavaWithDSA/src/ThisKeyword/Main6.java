package ThisKeyword;

public class Main6 {
    Main6(){
        this(10);
        System.out.println("1");
    }
    Main6(int n){
        System.out.println(n);
    }

    public static void main(String[] args) {
        Main6 m = new Main6();
    }
}
