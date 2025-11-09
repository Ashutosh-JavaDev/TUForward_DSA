import java.util.Arrays;

public class RotateArrayByOne {
    // Input 1,2,3,4,5
    // Output 2,3,4,5,1
    public static void rotatedArray(int[] arr){
       String str=Arrays.toString(arr);
    //    System.out.println(str);
        if(str.length()==1){
            System.out.print(str.charAt(0));
        }
        else{
            for(int i=1;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.print(arr[0]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={-1,0,3,6};
        rotatedArray(arr);  
       
    }
}
