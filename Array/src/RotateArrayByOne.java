public class RotateArrayByOne {
    // Input 1,2,3,4,5
    // Output 2,3,4,5,1
    public static void rotatedArray(int[] arr){
       
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        else{
            for(int i=0;i<arr.length;i++){
                
                arr[i]=arr[i+1];
                System.out.print(arr[i]+ " ");
            }
            System.out.println(arr[arr.length-1]=arr[0]);

        }
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotatedArray(arr);  
        System.out.println(arr);
    }
}
