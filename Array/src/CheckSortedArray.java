public class CheckSortedArray {
    static boolean result(int arr[]) {
     
      
        for (int i = 0; i < arr.length-1; i++) {
          if(arr[i]>arr[i+1]){
            return false;
        }
            
   
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 21, 22,23,24,25 };
        boolean res = result(arr);
        System.out.println(res);
    }
}
