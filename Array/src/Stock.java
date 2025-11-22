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
        if (isSorted(arr)) return 0;

        int min = arr[0];
        int maxProfit = 0;
    
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                maxProfit = Math.max(maxProfit, arr[i] - min);
            }
        }
        return maxProfit;
       
    }

    public static void main(String[] args) {
        int arrr[] = { 7,1,5,3,6,4};
        int res = sellbuy(arrr);
        System.out.println(res);
    }
}
