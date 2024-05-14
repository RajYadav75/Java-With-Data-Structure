package SuperAndFinalKeyword;
class One{
    One(){
        System.out.println("I am in One class constructor");
    }
}
class Two extends One{
    Two(){
        super();  //compiler by default give super method write or not
        System.out.println("I am in Two class constructor");
    }
}
public class Super4 {
    public static void main(String[] args) {
        Two ob = new Two();

    }
}
