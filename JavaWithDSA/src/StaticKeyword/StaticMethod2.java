package StaticKeyword;
class Up{
    void show1(){
        System.out.println("1");
    }
    static void show2(){
        System.out.println("2");
    }
}
public class StaticMethod2 {
    public static void main(String[] args) {
        Up ob = new Up();
        ob.show1();
        ob.show2();
        Up.show2();
//        show2(); Cannot resolve method 'show2' in 'StaticMethod2'
    }
}
