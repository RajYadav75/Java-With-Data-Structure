package Interfaces;

interface Vehicle1 {
    void start();
    void noOfGear(int a);
}
class Bus implements Vehicle1{
    public void start(){
        System.out.println("Bus starts with key");
    }
    public void noOfGear(int gears1){
        System.out.println("Bus has "+ gears1+" gears");
    }
}
class Car implements Vehicle1{

    public void start(){
        System.out.println("Car start with keys");
    }
    public void noOfGear(int gears1){
        System.out.println("Car has "+ gears1+" gears");
    }
}
class  Scooter implements Vehicle1{

    public void start(){
        System.out.println("Start with kick");
    }
    public void noOfGear(int gears1){
        System.out.println("Scooter has "+ gears1+" gears");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle();  we can not create object of an interface
        Bus b = new Bus();
        b.start();
        b.noOfGear(6);
    }
}
