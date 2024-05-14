package Strings.CoreStringPrograms;
import java.util.Arrays;
public class RemoveAllTheDuplicateFromString {
    public static void main(String[] args) {
        String str = "Rajnarayan Yadav";
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int j;
            for ( j = 0; j < i; j++) {
                if (ch[i] == ch[j]){
                    break;
                }
            }
            if (i == j){
                ch[count] = ch[i];
                count++;
            }
        }
//        while (count < str.length()){
//            ch[count] = ' ';
//            count++;
//
//        }
//        System.out.println(ch);
        String newStr = String.valueOf(Arrays.copyOf(ch,count));
        System.out.println(newStr);
    }
}
