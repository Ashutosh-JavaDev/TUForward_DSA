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
    public static int miss(int arr[]){
        int val=Arrays.stream(arr).sum();
        return val;
        // System.out.println(arr);
    }
    public static void main(String[] args) {
        int arr[]={0,1,3};
        // int res=missingNumber(arr);
        // System.out.println(res);
        int res=miss(arr);
        System.out.println(res);
        miss(arr);
    }
}
