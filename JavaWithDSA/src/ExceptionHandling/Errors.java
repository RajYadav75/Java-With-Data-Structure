package ExceptionHandling;

public class Errors {
//    statc int a = 10;   Lexical Error
    public static void main(String[] args) {
//        int a =10   Syntax error
        int a = 10, b = 20;
        int c = a+b;

        String s1 = "Raj", s2 = "Yadav";
        String ss = s1+s2;

        char c1 ='a', c2 = 'b';
//        char cc = c1+c2;  Semantic Error(Meaning Less Error)
    }
}
