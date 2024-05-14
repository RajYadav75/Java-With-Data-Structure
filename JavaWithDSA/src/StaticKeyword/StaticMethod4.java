package StaticKeyword;
class Raja{
//    static Raja(){
//      We can not make constructor static
//    }
    void show1(){
        System.out.println("2");
    }
    static void show(){
//        super.show1();
//        this.show1();
//        show1();
        System.out.println("1");
    }
}
public class StaticMethod4 {
    public static void main(String[] args) {
        Raja.show();
    }
}
