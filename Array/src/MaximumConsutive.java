public class MaximumConsutive {
    public static int Count(int arr[]) {
        int max = 0, currentMax = 0, prev = 0;
        for (int i = 0; i < arr.length; i++) {

           
            if (arr[i] == 1) {
                currentMax++;
                max = Math.max(max, currentMax);
            } else {
                currentMax = 0;
            }

            if (i == arr.length - 1 && arr[i] == 1) {
                prev = max;
            }
        }
        if (arr[arr.length - 1] != 1) {
            prev = max;
        }

        return prev;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 1 };
        int res = Count(arr);
        System.out.println(res);
    }
}
