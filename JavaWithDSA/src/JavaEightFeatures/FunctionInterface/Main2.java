package JavaEightFeatures.FunctionInterface;

import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        Function<String, String > f = str -> str.concat(" is java developer");
        System.out.println(f.apply("Raj"));
        System.out.println(f.apply("Bhagwan"));
    }
}
