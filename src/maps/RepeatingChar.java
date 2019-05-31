package maps;

import java.util.HashMap;
import java.util.Map;

public class RepeatingChar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = " ";
//        s = s.replaceAll("\\s","");
        char[] arr = s.toCharArray();
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        int count = 0;
        int max = 0;
        for(int x=0; x<arr.length; x++){
            
            String stri = Character.toString(arr[x]);
            map.put(stri, 0);
            count++;
            for(int y=x+1; y<arr.length; y++){
                String str = Character.toString(arr[y]);
                if(map.get(str)==null){
                    count++;
                    map.put(str,1);
                }else{
                    break;
                }
            }
            if(max<count){
                max=count;
            }
            count = 0;
            map.clear();
            
        }
        
        if(count>max){
            System.out.println(count);
        }else{
            System.out.println(max);
        }
    }

}
