package problems.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class FourSums {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int target = 1;
        int[] nums={1,0,-1,0,-2,2};
        
        Map<Integer, List<Pair>> map = new HashMap<Integer, List<Pair>>();
        for(int x=0; x<nums.length; x++){
            for(int y=x+1; y<nums.length; y++){
                Pair pair = new Pair();
                pair.a=nums[x];
                pair.b=nums[y];
                int pairSum = pair.a+pair.b;
                if(map.get(pairSum)==null){
                    List<Pair> list = new ArrayList<Pair>();
                    map.put(pairSum,list);
                }else{
                    map.get(pairSum).add(pair);
                }
            }
        }
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        for(Integer key : map.keySet()){
            
            for(Integer key2 : map.keySet()){
                
                if(key+key2==target){
                    if(!map.get(key).equals(map.get(key2))){
                        List<Pair> pairListA = map.get(key);
                        List<Pair> pairListB = map.get(key2);
//                        if(pairListA.size()>1){
                            for(Pair pair  : pairListA){
                                for(Pair pair2 : pairListB){
                                    List<Integer> list = new ArrayList<Integer>();
                                    list.add(pair.a);
                                    list.add(pair.b);
                                    list.add(pair2.a);
                                    list.add(pair2.b);
                                    Collections.sort(list);
                                    if(!solution.contains(list)) {
                                        solution.add(list);
                                    }
                                }
                            }
//                        }
                    }
                }
            }
        }
        Collections.sort(solution,new Comparator<List<Integer>>() {
            public int compare(List<Integer> list1, List<Integer> list2) {
                return list1.get(0).compareTo(list2.get(0));
            }
        });
        
        System.out.println("done");
//        return solution;
    }

}
