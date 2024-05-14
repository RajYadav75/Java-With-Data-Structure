package NestedClasses;
class Oter{
    static class Iner{
        void show(){
            System.out.println("1");
        }
        static void show1(){
            System.out.println("2");
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        Oter.Iner ob = new Oter.Iner();
        ob.show();
        Oter.Iner.show1();
    }
}
