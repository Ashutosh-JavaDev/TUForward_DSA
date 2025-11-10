public class LinearSearch {
 public static int searching(int arr[],int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
 }   
 public static void main(String[] args) {
    int arr[]={37,132,32,13,423};
    int res=searching(arr, 33);
    if(res==-1){
        System.out.print(res);
    }
    else{
        System.out.print(res+1);
    }
 }
}
