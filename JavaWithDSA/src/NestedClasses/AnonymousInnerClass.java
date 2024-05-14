package NestedClasses;
abstract class Vehicle{
    abstract void start();
    abstract void showName();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Vehicle v = new Vehicle() {

            void start(){
                System.out.println("Start with key");
            }
            void showName(){
                System.out.println("Tata Nexon");
            }
        };
        v.start();
        v.showName();
    }
}
