public class MovesZeroToEnd {
    public static void MoveZero(int arr[]){
        if(arr==null|| arr.length==0) return;
      int x=0;

      for(int num:arr){
            if(num!=0){
                arr[x++]=num;
            }
      }
      while(x<arr.length){
        arr[x++]=0;
      }
    }
    public static void main(String[] args) {
        int arr[]={0,2,0,4,3,0};
        MoveZero(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
