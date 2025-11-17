import java.util.Arrays;

public class MajorityElement {

    public static int element(int arr[]) {
        Arrays.sort(arr);

        int count = 1;
        int max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
public static int findElement(int arr[]){
    Arrays.sort(arr);
    int n = arr.length;
    for(int i=0;i<arr.lenngth;i++){
        
    }
}
    public static void main(String[] args) {
        int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        int res = element(arr);
        System.out.println("Data: " + res);  // Output: 5
    }
}
