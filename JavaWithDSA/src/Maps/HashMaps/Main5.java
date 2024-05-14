package Maps.HashMaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main5 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Map map = Collections.synchronizedMap(hm);
        HashMap hm1 = new HashMap(map);

    }
}
