package Strings.StringCore;

public class StringConstructor {
    public static void main(String[] args) {
        String str = new String("Raj");
        byte []b = {98, 97,90};
        String str2 = new String(b);
        System.out.println(str2);
        char [] c = {'a','b'};
        String str3 = new String(c);
        System.out.println(str3);

    }
}
