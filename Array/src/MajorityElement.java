import java.util.Arrays;

public class MajorityElement {
    public static int element(int arr[]){
        // Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]\\[0,0,1,2,7,7,7,7,7]
        int count=0,number=0;
       Arrays.sort(arr);
       int i,j=0;
       int n=arr.length;
       for(i=0;i<n;i++){
        if(arr[i]==arr[j]){
            count++;
        }
       }
        return number;
    }
}
