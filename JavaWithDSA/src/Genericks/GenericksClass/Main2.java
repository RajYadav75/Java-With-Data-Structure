package Genericks.GenericksClass;

public class Main2 {
    public static void main(String[] args) {
        A1<String> ob = new A1<String>("Raj Yadav is great");
        ob.show();
        A1<Integer> ob1 = new A1<Integer>(101);
        ob1.show();
    }
}
class A1<T>{
    T a;
    A1(T a){
        this.a = a;
    }
    void show(){
        System.out.println(a);
    }
}
