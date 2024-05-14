package Strings.StringCore;

public class EqualsAndEqualOperator {
    public static void main(String[] args) {
        String str1 = new String("Deepak");
        String str2 = new String("Deepak");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("====================================================");
        String  name = "Raj";
        String  name1 = "Raj";

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
    }
}
