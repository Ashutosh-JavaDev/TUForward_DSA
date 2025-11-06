public class SecondMax {
    static int second(int arr[]) {
        int secmax = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax=max;
                max = arr[i];
            }
            else if(arr[i]>secmax && max!=arr[i]){
                secmax=arr[i];
            }
            

        }
        return secmax;
    }

    public static void main(String[] args) {
        int arr[] = { 32, 12, 33, 52, 42 };
        int res = second(arr);
        System.out.println(res);
    }
}
