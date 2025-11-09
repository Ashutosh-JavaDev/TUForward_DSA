public class RotateArrayByOne {
    // Input 1,2,3,4,5
    // Output 2,3,4,5,1
    public static void rotatedArray(int[] arr){
        int temp=0;
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        else{
            for(int i=0;i<arr.length;i++){
                 temp=arr[0];
                arr[i]=arr[i+1];
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.print(temp);
    }
}
