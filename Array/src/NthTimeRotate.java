public class NthTimeRotate {
    // O(NxK);
    // static int x=1;
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
public static void functionCall(int arr[],int k){
    int n=arr.length;
    if(n<=1||k%n==0){
        return;
    }
    k%=n;
    reverse(arr, 0, k-1);
    reverse(arr, k, arr.length-1);

    reverse(arr, 0, n-1);
}

public static void reverse(int arr[],int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // rotate_N_Array(arr, 10);
        functionCall(arr, 8);
        // s(arr, 10, 1);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
