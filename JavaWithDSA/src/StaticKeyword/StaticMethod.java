package StaticKeyword;

public class StaticMethod {
    void show1(){
        System.out.println("1");
    }
    static void show2(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        StaticMethod ob = new StaticMethod();
        ob.show1();
        System.out.println("-------------------------------------------");
        StaticMethod.show2();
        ob.show2();
        show2();
    }
}
