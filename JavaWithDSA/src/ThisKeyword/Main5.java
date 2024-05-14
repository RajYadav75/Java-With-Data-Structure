package ThisKeyword;

public class Main5 {
    Main5(){
        System.out.println("1");
    }
    Main5(int n){
        this();
        System.out.println("2");
    }
    public static void main(String[] args) {
        Main5 ob2 = new Main5(10);

    }
}
