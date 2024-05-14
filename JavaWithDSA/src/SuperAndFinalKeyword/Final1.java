package SuperAndFinalKeyword;
class S{
    void m1(){
        final int a = 10;
//        a + 20; //Cannot assign a value to final variable 'a'
        System.out.println(a+20);
    }
}
public class Final1 {
    public static void main(String[] args) {
        S ob = new S();
        ob.m1();
    }
}
