package NestedClasses;
class Vehicle3{
    void start(){
        System.out.println("1");
    }
}
public class AnonymousInnerClass4 {
    public static void main(String[] args) {
        Vehicle3 v = new Vehicle3(){
            public void start(){
                System.out.println("Start with keys");
            }
        };
        v.start();
    }
}
