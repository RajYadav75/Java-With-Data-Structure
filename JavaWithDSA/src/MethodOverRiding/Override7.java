package MethodOverRiding;

public class Override7 {
    public static void main(String[] args) {
        Bhag ob = new Raj();
        String[] str = {"a","b","c"};
        ob.main(str);
    }
}
class Bhag{
    public static void main(String[] args) {
        System.out.println("1");
    }
}
class Raj extends Bhag{
    public static void main(String[] args) {
        System.out.println("2");
    }
}