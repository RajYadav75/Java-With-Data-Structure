package StaticKeyword;
class Raj{
    int a = 10;
    static void show(){
//        System.out.println(a); instance variable does not use in static method
    }
}
public class StaticMethod3 {
    public static void main(String[] args) {
        Raj ob = new Raj();
        ob.show();
    }
}
