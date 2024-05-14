package Strings.CoreStringPrograms;

public class RemoveAGivenCharInString {
    public static void main(String[] args) {
        String str = "Raj Java";
        char[] ch = str.toCharArray();
        char c = 'a';
        int j =0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] != c){
                ch[j] = ch[i];
                j++;
            }
            else {
                count++;
            }
        }
        while (count > 0){
            ch[j] = ' ';
            j++;
            count--;
        }
        System.out.println(ch);
    }
}
