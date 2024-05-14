package Strings.StringCore;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Raj";
        int len = name.length();
        System.out.println(len);
        System.out.println(name.length());

        System.out.println(name.isEmpty());
        String str = "                 Raj           Yadav                 ";
        System.out.println(str.trim());
    }
}
