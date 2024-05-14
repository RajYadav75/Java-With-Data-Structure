package Strings;

public class CompareFunction {
    public static void main(String[] args) {
        String s1 = "Baba";
        String s2 = "Baba";
        String s3 = new String("Baba");
        if(s1 == s2)
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are not equal.");
        if (s1 == s3){
            System.out.println("Strings are equal.");
        }
        else
            System.out.println("Strings are not equal.");
        if(s1.equals(s3)){
            System.out.println("Strings are equal.");
        }
        else
            System.out.println("Strings are not equal.");
    }
}
