package Constructor;
 class Animal {
    int age;
    String color;

    Animal(){

    }

    void eat(){
        System.out.println("I am eating");
    }
    void run(){
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.age = 10;
        buzo.color = "Brown";
        System.out.println("Age : "+buzo.age);
        System.out.println("Color : "+buzo.color);
        buzo.run();
        buzo.eat();
        System.out.println("------------------------");

        Animal cat = new Animal();
        cat.age = 14;
        cat.color = "Red";
        System.out.println(cat.age);
        System.out.println(cat.color);
        cat.eat();
        cat.run();
    }
}
