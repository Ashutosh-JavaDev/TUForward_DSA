public class NthTimeRotate {
    public static void rotate_N_Array(int arr[],int k){
        if(arr.length<=1){
            return;
        }
        else if(arr.length==k){
            return;
        }
        else{
            int first=arr[0];
            for(int i=1;i<=k;i++){
                for(int j=1;j<arr.length;i++){
                    arr[j-1]=arr[j];
                }
            }
            arr[arr.length-1]=first;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        rotate_N_Array(arr, 8);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
