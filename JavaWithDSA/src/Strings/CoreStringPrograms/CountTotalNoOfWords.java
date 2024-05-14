package Strings.CoreStringPrograms;

public class CountTotalNoOfWords {
    public static void main(String[] args) {
        String word = "This is my first demo";
        int count = 0;
        boolean b = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' '){
                b = true;
            } else if (b) {
                b = false;
                count++;
            }
        }
        System.out.println(count);
    }
}
