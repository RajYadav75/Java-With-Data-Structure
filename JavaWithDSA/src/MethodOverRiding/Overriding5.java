package MethodOverRiding;
class Par{

}
class Chil extends Par{

}
class Ab{
    Par show(){
        System.out.println("1");
        return new Par();  //Coverent Return TYpe
    }
}
class Ba extends Ab{
    Chil show(){
        System.out.println("2");
        return new Chil();
    }
}
public class Overriding5 {
    public static void main(String[] args) {
        Ab ob= new Ba();
        ob.show();
    }
}
