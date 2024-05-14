package Maps.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {
        HashMap<String ,String> hm = new HashMap<String ,String >();
        hm.put("101","Raj");
        hm.put("102","Baba");
        hm.put("103","Bhagwan");
        hm.put("104","God");
        hm.put("105","Yadav");
        for (Map.Entry me: hm.entrySet()){
            System.out.println(me.getKey()+" : "+me.getValue());
        }
    }
}
