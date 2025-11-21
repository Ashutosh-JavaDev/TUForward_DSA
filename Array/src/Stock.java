public class Stock {
    public static boolean isSorted(int arr[]) {

        boolean asc = true,desc=true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                asc = false;
            } else if (arr[i] < arr[i + 1]) {
                desc = false;
            }
        }
        return asc||desc;
    }

    public static int sellbuy(int arr[]) {
        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        int maxindex = 0;
        int minindex = 0;
        if (isSorted(arr)) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] < min) {
                    min = arr[i];
                    minindex = i;
                }
                if (arr[i] > max) {
                    max = arr[i];
                    maxindex = i;
                }
                if (minindex < maxindex) {
                    sum = max - min;
                }

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arrr[] = { 7,1,5,3,6,4};
        int res = sellbuy(arrr);
        System.out.println(res);
    }
}
