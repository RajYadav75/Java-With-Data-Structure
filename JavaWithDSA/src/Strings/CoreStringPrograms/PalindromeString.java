package Strings.CoreStringPrograms;
//Write a java program to check for string palindrome
public class PalindromeString {
    public static void main(String[] args) {
        String str = "aba";
        String rev = "";
        int len = str.length();
        for (int i = len-1; i >= 0; i--){
//            System.out.println(str.charAt(i));
            rev = rev +str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
