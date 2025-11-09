public class NthTimeRotate {
    public static void rotate_N_Array(int arr[],int k){
        if(arr==null||arr.length<=1){
            return;
        }
        else if(arr.length==k){
            return;
        }
        else{
            int first=arr[0];
            for(int i=1;i<=k;i++){
                for(int j=0;j<arr.length-1;i++){
                    arr[i-1]=arr[i];
                }
            }
            arr[arr.length-1]=first;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        rotate_N_Array(arr, 6);
        for(int val:arr){
            System.out.println(val);
        }
    }
}
