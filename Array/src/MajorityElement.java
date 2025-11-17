import java.util.Arrays;
import java.util.HashMap;

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

    public static int findElement(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int max = 0;
        int maxValue=arr[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int freq = map.getOrDefault(arr[i], 0) + 1;
            map.put(arr[i], freq);
            max = Math.max(max, freq);
            if(freq>maxValue){
                max=freq;
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        int res = findElement(arr);
        System.out.println("Data: " + res); // Output: 5
    }
}
