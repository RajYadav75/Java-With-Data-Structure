package Genericks.Genericboundedtypes;
class A<T>{
    void show(T t){
        System.out.println(t);
    }
}
public class Main1 {
    public static void main(String[] args)
    {
        A<Integer> ob =new A<Integer>();
        ob.show(101);

        A<String> ob1 = new A<String>();
        ob1.show("Raj");
    }
}
