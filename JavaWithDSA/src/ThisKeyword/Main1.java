package ThisKeyword;

public class Main1 {
    void m1(){
        System.out.println("I am in m1 method : "+this);
    }
    public static void main(String[] args) {
        Main1 ob = new Main1();
        System.out.println("I am in main method : "+ob);
//        System.out.println(this);
        ob.m1();
    }
}
