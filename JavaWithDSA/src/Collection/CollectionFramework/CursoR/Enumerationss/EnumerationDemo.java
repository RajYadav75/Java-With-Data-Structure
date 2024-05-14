package Collection.CollectionFramework.CursoR.Enumerationss;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("aaa");
        v.addElement("bb");
        v.addElement("cc");
        v.addElement("dddd");
        System.out.println(v);
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.print(e.nextElement()+" ");
        }
    }
}
