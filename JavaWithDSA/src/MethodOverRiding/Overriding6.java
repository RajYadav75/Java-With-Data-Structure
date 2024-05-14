package MethodOverRiding;

public class Overriding6 {
    public static void main(String[] args) {
        Aaaa ob = new Bbbb();
        ob.show();
    }
}
class Aaaa{
    void show(){
        System.out.println("1");
    }
}
class Bbbb extends Aaaa{
    public void show(){
        System.out.println("2");
    }
}