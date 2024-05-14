package Collection.CollectionFramework;

import javax.swing.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        int b = 20,c=30;
        int result  = a+b+c;
        System.out.println(result);

        //---------------------------------------------------------
        int[] arr = {1,2,3,4,5,6,7,8};
        int res2=0;
        for (int i = 0; i < arr.length; i++) {
            res2 = res2+arr[i];
        }
        System.out.println(res2);

        //-------------------------------------------------------------------------------
        JButton[] jb = new JButton[10];
        JButton jb1 = new JButton();
        JButton jb2 = new JButton();
        JButton jb3 = new JButton();
        JButton jb4  = new JButton();
        jb[0] = jb1;
        jb[1] = jb2;
        //-------------------------------------
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("raj");
        al.add(10.1);
        al.add(new Test());

        al.add(jb);
    }
}
