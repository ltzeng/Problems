package problems.arrays;

public class TwoArraysMedian {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums1 = {1,2,4};
        int[] nums2 = {3};
        double d = findMedianSortedArrays(nums1,nums2);
        System.out.println(d);
    }
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double medianValue = 0;
        int totalLength = nums1.length + nums2.length;
        if(totalLength==0){
            return medianValue;
        }
        if(totalLength==1){
            //figure out which to return
            if(nums1.length!=0){
                return nums1[0];
            }else{
                return nums2[0];
            }
        }
        int[] numsTotal = new int[totalLength];
        
        int index1=0;
        int index2=0;
        
        for(int x=0; x<totalLength; x++){
            if(index1>=nums1.length){
                numsTotal[x]=nums2[index2];
                index2++;
            } else if(index2>=nums2.length){
                numsTotal[x]=nums1[index1];
                index1++;
            } else if(nums1[index1]<nums2[index2]){
                numsTotal[x]=nums1[index1];
                index1++;
            } else{
                numsTotal[x]=nums2[index2];
                index2++;
            }
        }
        
        if(totalLength%2==1){
            int medianIndex = (totalLength/2); //[1,2,3]
            double medianDouble = numsTotal[medianIndex];
            return medianDouble;
        }else{
            int medianIndex1 = (totalLength/2);//[1,2,3,4]
            int medianIndex2 = medianIndex1-1;
            
            double median1 = numsTotal[medianIndex1];
            double median2 = numsTotal[medianIndex2];
            
            return (median1+median2)/2;
        }
    }

}
