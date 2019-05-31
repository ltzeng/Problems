package problems.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpiralArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int size = 8;
        Integer[][] spiral = new Integer[size][size];
        int indexX=0;
        int indexY=0;
        boolean upwardTraversal=false;
        
        for(int count=1; count<=size*size; count++) {
            spiral[indexY][indexX]=count;
            if(count==1) {
                indexX++;
            }else {
                if(indexY>0 && spiral[indexY-1][indexX]!=null) {
                    upwardTraversal=false;
                }
                if(indexX<size-1 && spiral[indexY][indexX+1]==null && !upwardTraversal) {
                    indexX++;
                }else if(indexY<size-1 && spiral[indexY+1][indexX]==null) {
                    indexY++;
                }else if(indexX>0 && spiral[indexY][indexX-1]==null) {
                    indexX--;
                }else if(indexY>0 && spiral[indexY-1][indexX]==null) {
                    indexY--;
                    upwardTraversal=true;
                }
            }
            Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
            Set<Integer> keyset = map.keySet();
            
        }
        
        for(Integer[] row : spiral) {
            String str = "";
            for(Integer i : row) {
                if(i<10) {
                    str=str+ " 0" + i;
                }else {
                    str=str+ " " + i;
                }
            }
            System.out.println(str);
        }
    }

}
