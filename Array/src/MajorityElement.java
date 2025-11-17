import java.util.Arrays;

public class MajorityElement {
    public static int element(int arr[]) {
        // Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]\\[0,0,1,2,7,7,7,7,7]
        int count = 1, number = 0, max = 1, data = 0;
        Arrays.sort(arr);
        int i, j = 1;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            if (arr[i] == arr[j]) {
                max = count++;
            } else {
                count = 1;
            }
            data = Math.max(max, count);

            j++;
            if (j == n) {
                break;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7 };
        int res = element(arr);
        System.out.println("Data:" + res);
    }
}
