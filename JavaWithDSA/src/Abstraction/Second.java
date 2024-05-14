package Abstraction;
abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Start with key");
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println("Start with kick");
    }
}
public class Second {
    public static void main(String[] args) {
        Car ob = new Car();
        ob.start();
        System.out.println("------------------------");
        Scooter ob1 = new Scooter();
        ob1.start();
    }
}
