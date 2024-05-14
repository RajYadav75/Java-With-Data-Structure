package Abstraction;
abstract class A{
    A(){

    }
    void  show1(){

    }
    abstract void show();
    abstract void display();
}
class B extends A{
    B(){
        super();
    }
    void show(){

    }
    void display(){

    }
}
//or
abstract class Bb extends A{

}
public class First {
    public static void main(String[] args) {
        A ob;
    }
}
