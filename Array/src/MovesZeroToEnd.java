public class MovesZeroToEnd {
    public static void MoveZero(int arr[]) {
       
        int  j=0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    
        }
    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4, 3, 0 };
        MoveZero(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
