package Strings.CoreStringPrograms;

public class PrintFirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Raj is Ra good boy";
        int[] arr = new int[126];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] > 1){
                c = str.charAt(i);
                break;
            }
        }
        System.out.println("First repeated character is : "+c);
    }
}
