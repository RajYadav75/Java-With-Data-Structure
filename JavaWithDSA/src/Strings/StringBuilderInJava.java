package Strings;

public class StringBuilderInJava {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello World");
//        System.out.println(sb.toString());
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
