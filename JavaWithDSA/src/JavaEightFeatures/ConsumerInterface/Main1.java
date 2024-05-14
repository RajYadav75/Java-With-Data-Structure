package JavaEightFeatures.ConsumerInterface;

import java.util.function.Consumer;

public class Main1 {
    public static void main(String[] args) {
        Consumer<String> c = str -> System.out.println("Hi : "+str.concat("@gmail.com"));
        c.accept("Raj");
    }
}
