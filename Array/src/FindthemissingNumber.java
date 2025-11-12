import java.util.Arrays;

public class FindthemissingNumber {
    public static int missingNumber(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int actual=((arr.length*(arr.length+1))/2);
        int miss=actual-sum;
        return miss;
    }
   
    public static void main(String[] args) {
        int arr[]={0,1,3};
        int res=missingNumber(arr);
        System.out.println(res);
       
    }
}
