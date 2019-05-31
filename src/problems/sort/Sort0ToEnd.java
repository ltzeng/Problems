package problems.sort;

import java.util.Arrays;

public class Sort0ToEnd {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {0,1,1,5,0,2,5,0};
        
        int index = 0;
        for(int x=0; x<arr.length; x++) {
            
            if(index==x) {
                if(arr[index]!=0) {
                    index++;
                }
            }else {
                if(arr[x]!=0) {
                    arr[index]=arr[x];
                    index++;
                }
            }
        }
        
        for(int x=index; x<arr.length; x++) {
            arr[x]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

}
//1015 0,0 x++ index++ 
//1010 1,1 x++
//1105 2,1 x++ index++

//0012 0,0 x++
//0012 1,0 x++
//1002 2,1 x++ index++