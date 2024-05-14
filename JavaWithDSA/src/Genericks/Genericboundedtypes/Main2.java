package Genericks.Genericboundedtypes;
class A1<T extends Number>{
    void show(T t){
        System.out.println(t);
    }
}
public class Main2 {
    public static void main(String[] args)
    {
        A1<Integer> ob = new A1<>();
        ob.show(101);

//        A1<String> ob1 = new A1<String>(); here came error
//        ob1.show("Raj");
        A1<Long> ob2 = new A1<>();
        ob2.show(345734L);

        A1<Float> ob3 = new A1<>();
        ob3.show(124132.512f);
    }
}
