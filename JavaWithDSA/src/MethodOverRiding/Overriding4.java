package MethodOverRiding;
class Aaa{
    int show(int a){
        System.out.println(a);
        return 0;
    }
}
class Bbb extends Aaa{
    void show(String a){
        System.out.println(a);
    }
}
public class Overriding4 {
    public static void main(String[] args) {
        Aaa ob = new Bbb();
        ob.show(10);
        // Here is not overriding concept.
    }
}
