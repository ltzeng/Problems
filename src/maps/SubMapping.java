package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SubMapping {

  public static void main(String[] args) {
    
    Map<String,String> radarAttrs = new HashMap<String,String>();
    radarAttrs.put("111-jfkdla", "one");
    radarAttrs.put("111-uiro2903", "two");
    radarAttrs.put("111-48732957", "three");
    
    radarAttrs.put("222-jfkdla", "fail");
    
    
    TreeMap<String,String> treeMapAttrs = new TreeMap<String,String>();
    treeMapAttrs.putAll(radarAttrs);
    Map<String,String> submapp = treeMapAttrs.subMap("111", "111"+Character.MAX_VALUE);
    
    System.out.println(submapp);
  }

}
