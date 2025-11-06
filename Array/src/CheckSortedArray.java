import java.util.Arrays;
public class CheckSortedArray {
    static boolean result(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
          if(arr[i]>arr[i+1]){
            return false;
        }
            
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 5,4,3,2,1};
        boolean res = result(arr);
        System.out.println(res);
    }
}
