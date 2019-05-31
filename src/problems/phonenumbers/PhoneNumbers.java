package problems.phonenumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String digits = "789";
        
        Map<String,List<String>> map = createMap();
        List<String> answer = new ArrayList<String>();
        
        String[] nodes = digits.split("");
        
        for(String firstLetter : map.get(nodes[0])) {
            combine(1,firstLetter,map,nodes,answer);
        }
        for(String s : answer) {
            System.out.println(s);
        }
        
    }
    
    private static void combine(int index, String currentVal, Map<String,List<String>> map, String[] nodes, List<String> answer) {
        
        if(nodes.length<=index) {
            answer.add(currentVal);
        }else {
            String updatedCurrentVal="";
            for(String s : map.get(nodes[index])){
                updatedCurrentVal=currentVal+s;
                combine(index+1, updatedCurrentVal, map, nodes, answer);
            }
        }
        
    }
    
    public static Map<String, List<String>> createMap() {
        
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        map.put("2", Arrays.asList("a","b","c"));
        map.put("3", Arrays.asList("d","e","f"));
        map.put("4", Arrays.asList("g","h","i"));
        map.put("5", Arrays.asList("j","k","l"));
        map.put("6", Arrays.asList("m","n","o"));
        map.put("7", Arrays.asList("p","q","r","s"));
        map.put("8", Arrays.asList("t","u","v"));
        map.put("9", Arrays.asList("w","x","y","z"));
        return map;
    }

}
