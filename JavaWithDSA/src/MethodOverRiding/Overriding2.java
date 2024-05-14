package MethodOverRiding;
class AA{
    void show(){
        System.out.println("1");
    }
}
class BB extends AA{
    void show(){
        System.out.println("2");
    }
}
public class Overriding2 {
    public static void main(String[] args) {
        AA ob1 = new AA();
        ob1.show();

        BB ob2 = new BB();
        ob2.show();

        AA ob3 = new BB();
        ob3.show();
    }
}
