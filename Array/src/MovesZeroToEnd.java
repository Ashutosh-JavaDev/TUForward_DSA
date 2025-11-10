public class MovesZeroToEnd {
    public static void MoveZero(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0&&i!=arr.length-1){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
           
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4,0};
        MoveZero(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
