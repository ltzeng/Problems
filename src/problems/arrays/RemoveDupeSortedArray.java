package problems.arrays;

public class RemoveDupeSortedArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = getArr();
        
        int uniqueIndex = 0;
        for(int x=0; x<nums.length; x++){
            if(x==0){
                //uniqueIndex++;
            }else{
                if(nums[x]!=nums[x-1]){
                    uniqueIndex++;
                }
                nums[uniqueIndex]=nums[x];
                
            }
        }
    }

    private static int[] getArr() {
        
        int[] nums = {1,2,2,3,3,5};
        return nums;
    }

    //0 0 1 2 2 3
}
