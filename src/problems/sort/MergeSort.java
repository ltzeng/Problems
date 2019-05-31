package problems.sort;

public class MergeSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    
    public void mergeSort(int arr[], int l, int r) {
        if(l<r) {
            int mid = l+(r-l)/2;
            
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            
            merge(arr, l,mid,r);
        }
    }


    private void merge(int[] arr, int l, int mid, int r) {

        
    }
}
