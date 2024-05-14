package MethodOverloading;

class Test1{
    void sum(int a, int b){
        int res = a+b;
        System.out.println(res);
    }
    void sum(float a, float b){
        float res = a+b;
        System.out.println(res);
    }

}
public class MethodOverloading2 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.sum(10,20);
        t.sum(10.4f,12.7f);
    }
}

