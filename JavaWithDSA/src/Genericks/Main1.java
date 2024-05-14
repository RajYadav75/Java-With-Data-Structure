package Genericks;

import java.util.ArrayList;

public class Main1
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        String[] strarr = new String[3];
        strarr[0] = "Raj";
        strarr[1] = "Deepak";
        strarr[2] = "Bhagwan";

        String name = strarr[0];
        System.out.println(name);


        ArrayList al = new ArrayList();
        al.add(12);
        al.add("Deepak");
        al.add(14);
        al.add("Raj");
        al.add(16.2);
        String name1 = (String) al.get(3);
        int aa = (int) al.get(0);
        System.out.println(aa+" : "+name1);
    }
}
