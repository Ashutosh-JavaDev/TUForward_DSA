public class TwoSum {
    public static int[] twoSum(int arr[],int target){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+arr[j]==target){
                return new int[]{arr[i],arr[j]};
            }
        }
        return null ;
    }
}
