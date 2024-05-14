package Collection.Lists.Vectors.Stacks;

public class Main2 {
    void m1(){
        System.out.println("I am in m1 method");
        m3();
        System.out.println("M1");
    }
    void m2(){
        System.out.println("I am in m2 method");
        m1();
        System.out.println("m2");
    }
    void m3(){
        System.out.println("I am in M3 method");
        System.out.println("M3");
    }
    public static void main(String[] args) {
        Main2 m = new Main2();
        m.m2();
    }
}
