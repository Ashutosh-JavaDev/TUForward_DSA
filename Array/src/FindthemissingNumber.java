public class FindthemissingNumber {
    public static int missing(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int actual=((arr.length*(arr.length+1))/2);
        int miss=actual-sum;
        return miss;
    }
}
