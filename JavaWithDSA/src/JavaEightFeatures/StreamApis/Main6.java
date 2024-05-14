package JavaEightFeatures.StreamApis;

import java.util.ArrayList;
import java.util.stream.Stream;
//WAP to convert all the names to uppercase
public class Main6 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("rajnarayan");
        str.add("DeepakKumar");
        str.add("rajn");
        str.add("rajana");

        Stream<String > s = str.stream();
//        s.map(e->e.toUpperCase()).forEach(e-> System.out.println(e));
        //Wap to get the first character of each name.
//        s.map(e->e.charAt(0)).forEach(e-> System.out.println(e));
        //Wap to replace the a character to z character
        s.map(e->e.replace("a","z")).forEach(e-> System.out.println(e));

    }
}
