package MethodOverloading;
class Test9{
    Test9(){
        System.out.println("1");
    }
    Test9(int a){
        System.out.println("2");
    }
}

public class MethodOverloading13 {
    public static void main(String[] args) {
       Test9 t1 =  new Test9();
       Test9 t2 =  new Test9(10);
       new Test9();   // This is also a method to call the constructor
       new Test9(12);
    }

}

