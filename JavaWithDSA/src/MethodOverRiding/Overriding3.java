package MethodOverRiding;
class AAa{
    void show(int a){
        System.out.println(a);
    }
}
class BBb extends AAa{
    void show(int a){
        System.out.println(a);
    }
}
public class Overriding3 {
    public static void main(String[] args) {

        AAa ob3 = new BBb();  //Upcasting Object TypeCasting
        ob3.show(20);
    }
}
