package MethodOverRiding;
class Parent2{

}
class child2 extends Parent2{

}
public class DownCasting {
    public static void main(String[] args) {
//        B ob = new A();  In java implicit downcasting is not possible so explicite downcasting we use
        A ob = new B();
        B ob1 = (B) ob; //Explicite DownCasting
    }
}
