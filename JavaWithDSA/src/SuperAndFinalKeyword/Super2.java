package SuperAndFinalKeyword;
class Aa{
    void show1(){
        System.out.println("I am in class Aa");
    }
}
class Bb extends Aa{
    void show2(){
        super.show1();
        System.out.println("I am in class Bb");
    }
}
public class Super2 {
    public static void main(String[] args) {
        Bb ob = new Bb();
        ob.show2();
    }
}
