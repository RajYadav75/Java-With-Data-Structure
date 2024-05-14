package MethodOverRiding;
class Parent{
    void marry(){
        System.out.println("Arrange Marriage");
    }
    void greet(){
        System.out.println("Namaste");
    }
}
class child extends Parent{
    void marry(){
        System.out.println("Love marriage");
    }
    void greet(){
        System.out.println("Hello Dude");
    }
}
public class Overriding {
    public static void main(String[] args) {

    }
}
