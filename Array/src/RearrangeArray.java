import java.util.Arrays;

public class RearrangeArray {
    public static int[] rearrange(int arr[]) {
        int newArr[] = new int[arr.length];
        Arrays.sort(arr);

        int posIndex = 1;
        int negIndex = 0;
        for (int newNum : arr) {
            if (newNum < 0) {
                if (negIndex < arr.length) {
                    newArr[negIndex] = newNum;
                    negIndex += 2;
                }
            } else {
                if (posIndex < arr.length) {
                    newArr[posIndex] = newNum;
                    posIndex += 2;
                }
            }
        }
        return newArr;

    }

    public static void main(String[] args) {
        // -5,-3,2,4,6 || -5,2-3,4,68
        int arr[] = { 2, -3, 4, -5, 8 };
        int res[] = rearrange(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
