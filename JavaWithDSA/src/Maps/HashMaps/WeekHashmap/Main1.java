package Maps.HashMaps.WeekHashmap;

public class Main1 {
    public static void main(String[] args) {
        A ob = new A();

        ob = null;
        System.gc();
    }
}
class A{
    A(){
        System.out.println("Object created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted");
    }
}
