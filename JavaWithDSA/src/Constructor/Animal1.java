package Constructor;
class Animal1 {
    int age;
    String color;
    Animal1(){

    }
    Animal1(int age1,String color1){
        age = age1;
        color = color1;
    }

    void eat(){
        System.out.println("I am eating");
    }
    void run(){
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        Animal1 ob = new Animal1();
        Animal1 buzo = new Animal1(10,"brown");
        System.out.println("Age : "+buzo.age);
        System.out.println("Color : "+buzo.color);
        buzo.run();
        buzo.eat();
        System.out.println("------------------------");
        Animal1 cat = new Animal1(12,"Red");
        System.out.println(cat.age);
        System.out.println(cat.color);
        cat.eat();
        cat.run();
    }
}
