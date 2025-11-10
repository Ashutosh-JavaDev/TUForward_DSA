public class MovesZeroToEnd {
    public static void MoveZero(int arr[]) {
        // if(arr==null|| arr.length==0) return;
        // int x=0;

        // for(int num:arr){
        // if(num!=0){
        // arr[x++]=num;
        // }
        // }
        // while(x<arr.length){
        // arr[x++]=0;
        // }
        int  j=0;
        for (int val : arr) {
            if(arr[val]!=0){
                int temp=arr[val];
                arr[val]=arr[j];
                arr[j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 0, 4, 3, 0 };
        MoveZero(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
