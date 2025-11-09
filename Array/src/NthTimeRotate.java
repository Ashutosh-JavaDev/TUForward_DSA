public class NthTimeRotate {
    // O(NxK);
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
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(k!=0){
                arr[i-1]=arr[i];
                // return;
            }
          else{
            arr[i-1]=arr[i];
          }
        }
        arr[arr.length-1]=first;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        rotate_N_Array(arr, 3);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
