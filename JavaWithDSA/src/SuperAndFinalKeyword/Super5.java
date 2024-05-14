package SuperAndFinalKeyword;
class One1{
    One1(){
        System.out.println("I am in One1");
    }
}
class Two1 extends One1{
    Two1(){
        System.out.println("I am in Two1");
//        super();
    }
}
public class Super5 {
    public static void main(String[] args) {
        Two1 ob = new Two1();
    }
}
