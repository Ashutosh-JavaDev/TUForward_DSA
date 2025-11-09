public class RotateArrayByOne {
    // Input 1,2,3,4,5
    // Output 2,3,4,5,1
    public static void rotatedArray(int[] arr){
       
        if(arr==null||arr.length<=1){
            return;
        }
        else{
            int temp=arr[0];
            for(int i=0;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
        }
       
       
    }
    public static void main(String[] args) {
        int arr[]={-1,0,3,6};
        rotatedArray(arr);  

        for(int val:arr){
            System.out.print(val+" ");
        }
       
    }
}
