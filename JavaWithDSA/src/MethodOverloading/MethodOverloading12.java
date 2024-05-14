package MethodOverloading;


public class MethodOverloading12 {
    public static void main(String[] args) {
        System.out.println("1");

        MethodOverloading12 ob = new MethodOverloading12();
        ob.main("Raj");
    }
    public static void main(String args){
        System.out.println("2");
    }
}

