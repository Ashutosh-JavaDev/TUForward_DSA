public class MaximumConsutive {
    public static int Count(int arr[]) {
        int max = 0,currentMax=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 1 || arr[i] < 0) {
                return -1;
            } else if (arr[i] == 0) {
                currentMax = 0;
                continue;
            } else if (arr[i] == 1) {
                currentMax++;
                max=currentMax;
            }
            else{
                return 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0 ,0,0,0};
        int res = Count(arr);
        System.out.println(res);
    }
}
