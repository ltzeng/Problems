package problems.fibbo;

import java.util.HashMap;
import java.util.Map;

public class Fibbonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] fibbArr = createFibbArray(20);
        Map<Integer, Integer> fibbMap = createFibbMap(fibbArr);
        
        findLargestFibb(fibbMap);
    }

    private static void findLargestFibb(Map<Integer, Integer> fibbMap) {
        // find largest fibb number in given sequence, assuming we have the highest one in the map
        int max = -1;
        int[] numbers = {0 ,2 ,8 ,5 ,233 ,1 ,4 ,13, 23,144,144,145};
        for(int i : numbers) {
            
            if(fibbMap.get(i)!=null) {
                if(i>max) {
                    max=i;
                }
            }
        }
        
        System.out.println(max);
        
    }

    public static Map<Integer, Integer> createFibbMap(int[] fibbArr) {
        
        Map<Integer, Integer> fibbMap = new HashMap<Integer, Integer>();
        for(int i:fibbArr) {
            fibbMap.put(i, 0);
        }
        
        return fibbMap;
        
    }
    
    public static int[] createFibbArray(int length) {
        
        int[] fibbArr = new int[length];
        fibbArr[0]=0;
        fibbArr[1]=1;
        System.out.println();
        
        for(int x=2; x<length; x++) {
            
            int val = fibbArr[x-2] + fibbArr[x-1];
            fibbArr[x]=val;
        }
        
        return fibbArr;
        
    }
}
