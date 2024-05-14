package MethodOverloading;


public class MethodOverloading11 {
    public static void main(String[] args) {
        System.out.println("1");

        MethodOverloading11 ob = new MethodOverloading11();
        int[] arr = {10,20};
        ob.main(arr);
    }
    public static void main(int[] args){
        System.out.println("2");
    }
}

