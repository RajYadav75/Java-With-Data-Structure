package Genericks.GenericMethodandGenericWildcards;

import java.util.ArrayList;

class A<T>{
    void show(ArrayList<?> al){
        System.out.println(al);
    }
}
public class Main1 {
    public static void main(String[] args) {
        A ob = new A();
        ArrayList<String> al = new ArrayList<>();
        ob.show(al);

        ArrayList<Integer> all = new ArrayList<>();
        ob.show(all);
    }
}
