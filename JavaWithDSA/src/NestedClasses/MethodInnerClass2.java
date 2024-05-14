package NestedClasses;
class Outer4{
    void show(){
        class Inner4{
            int a = 10;
            private int aa = 20;
            public  int aab = 30;
            void show2(){
                System.out.println(a);
                System.out.println(aa);
                System.out.println(aab);
            }
        }
        Inner4 i = new Inner4();
        i.show2();
    }
}
public class MethodInnerClass2 {
    public static void main(String[] args) {
        Outer4 ob = new Outer4();
        ob.show();
    }
}
