public class CheckSortedArray {
    static boolean result(int arr[]) {
        boolean ans = true;
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > arr[j]) || arr[i] < arr[j]) {
                ans = true;
                j++;
            } else {
                ans = false;
                break;
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 21, 23, 42, 13, 42 };
        boolean res = result(arr);
        System.out.println(res);
    }
}
