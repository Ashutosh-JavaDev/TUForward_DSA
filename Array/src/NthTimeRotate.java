public class NthTimeRotate {
    // O(NxK);
    static int x=1;
    public static void rotate_N_Array(int arr[], int k) {
        if (arr.length <= 1) {
            return;
        } else if (arr.length == k) {
            return;
        } else {
            if (k == 0) {
                return;
            } else {
                for (int j = 1; j <= k; j++) {
                    int first = arr[0];

                    for (int i = 1; i < arr.length; i++) {
                        arr[i - 1] = arr[i];

                    }
                    arr[arr.length - 1] = first;
                }
                System.out.println();
            }
        }

    }
    // O(N)

    public static void s(int arr[], int k) {
        if(k==0)
        {
            return;
        }
        else{
            int first=arr[0];
            arr[x-1]=arr[x];
            x++;
            arr[arr.length-1]=first;
            s(arr, k--);
        }
       
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        rotate_N_Array(arr, 10);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
