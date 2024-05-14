package Strings.StringsBuffer;

public class FirstBuffer {
    public static void main(String[] args) {
        String name = "Raj";
        name.concat(" Yadav");
        System.out.println(name);


        System.out.println("===================================");


        StringBuffer sb = new StringBuffer("Raj");
        sb.append(" Yadav");
        System.out.println(sb);
    }
}
