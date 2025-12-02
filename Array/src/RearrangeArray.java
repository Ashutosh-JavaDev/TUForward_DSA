import java.util.Arrays;
public class RearrangeArray {
    public static int[] rearrange(int arr[]){
        int newArr[]=new int[arr.length-1],j=0;
        Arrays.sort(arr);        
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>0){
                    newArr[j]=arr[i];
                }
               
            }
        }
        return newArr;
    }
}
