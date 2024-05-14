package NestedClasses;
class Baba{
    private  int a = 10;
    int c = 30;
    static  int b = 20;
    static class Innner{
        void show(){
//            System.out.println(a);
            System.out.println(b);
//            System.out.println(c);
        }
    }
}
public class StaticNestedClass1 {
    public static void main(String[] args) {
        Baba.Innner ob= new Baba.Innner();
        ob.show();
    }
}