public class LinearSearch {
 public static int searching(int arr[],int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
 }   
}
