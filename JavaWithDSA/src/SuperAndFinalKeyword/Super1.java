package SuperAndFinalKeyword;
class A{
    int no = 10;
}
class B extends A{
    int no = 20;
    void show(int no){
        System.out.println("Main number : "+no);
        System.out.println("This number : "+this.no);
        System.out.println("Super number : "+super.no);
    }

}
public class Super1 {
    public static void main(String[] args) {
        B ob = new B();
        ob.show(30);
    }
}
