package problems.arraysubsets;

public class Subsets {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = {1,2,3,4,5,6,7,8};
        
        for(int x=0; x<arr.length; x++) {
            
            System.out.println(arr[x]);
            int i = x;
            StringBuilder sb = new StringBuilder();
            sb.append(arr[x] + ",");
            while (i<arr.length) {
                if(i!=x) {
                    sb.append(arr[i] + ",");
                    System.out.println(sb.toString());
                }
                i++;
            }
        }
    }

}
