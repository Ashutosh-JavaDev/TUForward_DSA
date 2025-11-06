public class CheckSortedArray {
    static boolean result(int arr[]){
        boolean ans=true;
        for(int i=0;i<arr.length;i++){
            if((arr[i]>arr[i+1])||(arr[i]<arr[i+1])){
                ans=true;
            }
            else{
                ans=false;
            }
        }
        return ans;
    }
    
}
