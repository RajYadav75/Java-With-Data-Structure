package TypeCast;

public class JavaTypecast {
    public static void main(String[] args) {
        // int  a = 1;
        // System.out.println(a);
        int marks = (int) 99.99f;//explicit type cast
        System.out.println(marks);

        /*Java automatically promotes each byte short or char operand to int when evaluating an expression */
        char a ='a';
        char b ='b';
        System.out.println(b-a);//98-97=1
        /* If one operand is long, float or double the whole expression is promoted to long, float or double respectively */
        int x =10;
        float y =10.87f;
        long c =10;
        double d =10;
        double answer = x+y+c+d;
        System.out.println(answer);
    }
}
