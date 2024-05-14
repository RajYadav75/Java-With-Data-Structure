package NestedClasses;
class Outer{
    void show1(){
        System.out.println("1");
    }
    class Inner{
        void show2(){
            System.out.println("2");
        }
    }
}
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer ob = new Outer();
        ob.show1();
        Outer.Inner ob2 = ob.new Inner();
        ob2.show2();
    }
}
