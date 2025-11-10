import java.util.Arrays;

public class CheckSortedArray {
    static boolean result(int arr[]) {
        Arrays.sort(arr);
        boolean asc = true, desc = true;
    
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) asc = false;   // breaks ascending
            if (arr[i] < arr[i + 1]) desc = false;  // breaks descending
        }
    
        return asc || desc;
    }
    

    public static void main(String[] args) {
        int arr[] = { 3,4,5,1,2 };
        boolean res = result(arr);
        System.out.println(res);
    }
}
