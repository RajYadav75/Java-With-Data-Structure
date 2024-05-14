package Strings.CoreStringPrograms;
// Write a program to reverse a string


public class ReverseString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Raj Yadav");
        System.out.println(sb.reverse());


        String str = "Raj";
        String rev = "";
        int len = str.length();
        for (int i = len-1; i >= 0; i--){
//            System.out.println(str.charAt(i));
            rev = rev +str.charAt(i);
        }
        System.out.println(rev);
    }
}
