package Maps;

public class Main2 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2);
        Integer i= new Integer(100);
        Integer ii = new Integer(100);
        System.out.println(i==ii);
        System.out.println(i.equals(ii));
        System.out.println("================================");
        String str1 = "raj";
        String str2 = "raj";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println("================================");
        String  st = new String("raj");
        String  st1 = new String("raj");
        System.out.println(st==st1);
        System.out.println(st.equals(st1));
        System.out.println("================================");
        Main2 m1 = new Main2();
        Main2 m2 = new Main2();
        System.out.println(m1==m2);
        System.out.println(m1.equals(m2));
        System.out.println("================================");
    }
}
