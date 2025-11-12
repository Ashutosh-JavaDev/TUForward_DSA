public class MaximumConsutive {
    public static int Count(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 1 || arr[i] < 0) {
                return -1;
            } else if (arr[i] != 1) {
                return 0;
            } else if (arr[i] == 0) {
                count = 0;
                
                continue;
            } else if (arr[i] == 1) {
                count++;
                
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 1, 1, 0 };
        int res = Count(arr);
        System.out.println(res);
    }
}
