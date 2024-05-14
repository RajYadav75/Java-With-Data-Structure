package StaticKeyword;
class PageVisitor{
    static int count = 0;
    PageVisitor(){
        count = count +1;
        System.out.println("Visitor : "+count);
    }
    void noOfVisitor(){
        System.out.println(count);
    }
}
public class Static2 {
    public static void main(String[] args) {
        PageVisitor v1 = new PageVisitor();
        PageVisitor v2 = new PageVisitor();
        PageVisitor v3 = new PageVisitor();
        PageVisitor v4 = new PageVisitor();
        PageVisitor v5 = new PageVisitor();
        v5.noOfVisitor();
    }
}
