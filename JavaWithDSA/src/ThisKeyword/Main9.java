package ThisKeyword;
class Test3{
    Test3 m1(){
        return this;
    }
}
public class Main9 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        Test3 ob = t.m1();
        System.out.println(ob);
    }
}
