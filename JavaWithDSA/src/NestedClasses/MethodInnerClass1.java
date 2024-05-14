package NestedClasses;
class Outer3{
    void show(){
        System.out.println("1");
        class Inner3{
            void show2(){
                System.out.println("2");
            }
        }
    }
    void show3(){
//        Inner3 i = new Inner3();  We can not invoke inner class method from outside the method.
//        i.show2();
    }
}
public class MethodInnerClass1 {
    public static void main(String[] args) {
        Outer3 ob = new Outer3();
        ob.show();
    }
}
