package ThisKeyword;
class Test{
    Test(){
        this(10);
        System.out.println("Default Constructor");
    }
    Test(int a){
        this("Raj");
        System.out.println(a);
    }
    Test(String a){
        System.out.println(a);
    }
}
public class ConstructorChaing {
    public static void main(String[] args) {
        Test ob1 = new Test();
    }
}
