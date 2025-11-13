import java.util.Arrays;

public class MajorityElement {
    public static int element(int arr[]){
        int count=0,number=0;
        Arrays.sort(arr);
        int j=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[j]){
                count++;
            }
            if(arr[i]==arr[j+1]){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return number;
    }
}
