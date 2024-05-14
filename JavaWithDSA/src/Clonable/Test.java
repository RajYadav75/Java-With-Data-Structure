package Clonable;

public class Test {
    int i;
    String str;

    Test(int i,String str){
        this.i = i;
        this.str = str;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Test t1 = new Test(10,"Raj");
        Test t2 =(Test)t1.clone();
        System.out.println(t2.i);
        System.out.println(t2.str);
    }
}
