package Strings.StringTokenizr;

import java.util.StringTokenizer;

public class First {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("This is my first demo");

        System.out.println(st.countTokens());

        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}
