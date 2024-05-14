package Strings;

public class CharAtFunction {
    public static void printletters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String firstName = "Baba";
        String lastName = "Yaga";
        String fullName = firstName + " " + lastName;
        printletters(fullName);
    }
}
