package Strings.CoreStringPrograms;

import java.util.Arrays;

//car, arc; keep, peek; Anagram meaning full
public class AnagramStringOrNot {
    public static void main(String[] args) {
        String str1 = "keep";
        String str2 = "peek";

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)){
            System.out.println(" Two strings are anagram ");
        }else {
            System.out.println("Strings are not anagram");
        }

    }
}
