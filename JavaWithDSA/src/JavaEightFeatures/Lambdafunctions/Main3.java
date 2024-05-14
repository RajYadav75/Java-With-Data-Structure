package JavaEightFeatures.Lambdafunctions;
@FunctionalInterface
interface I3{
    void m1();
}

public class Main3 {
    public static void main(String[] args) {
        I3 i = () ->
        {
            System.out.println("Hi i am lambda function");
        };
        i.m1();

        // in one line
        I3 i1 = () -> {System.out.println("I am Lambda function");};
        i1.m1();
        // if we have only one statement we can remove curly braces
        I3 i2 = () -> System.out.println("I am Lambda function");
        i2.m1();
    }
}
