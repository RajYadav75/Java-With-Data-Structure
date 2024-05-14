package ThisKeyword;

public class Main4 {
    void m1(){
        System.out.println("I am in M1 method");
        m2();   // this.m2();
        this.m2();
    }
    void m2(){
        System.out.println("I am in M2 method");
    }
    public static void main(String[] args) {
        Main4 ob = new Main4();
        ob.m1();
//        ob.m2();
    }
}
