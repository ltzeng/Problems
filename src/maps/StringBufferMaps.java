package maps;

import java.util.HashMap;
import java.util.Map;

public class StringBufferMaps {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringBuffer sb = new StringBuffer();
        sb.append("test");
        
        Map<StringBuffer, String> map = new HashMap<StringBuffer, String>();
        map.put(sb, "hello");
        
        for(StringBuffer val: map.keySet()) {
            System.out.println(val);
            System.out.println(val.hashCode());
        }
        
        
        System.out.println(map.get(sb));
        
        sb.append("abc");
        
        for(StringBuffer val: map.keySet()) {
            System.out.println(val);
            System.out.println(val.hashCode());
        }
        
        System.out.println(map.get(sb));
    }

}
