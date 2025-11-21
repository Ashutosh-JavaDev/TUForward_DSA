public class Stock {
    public static boolean isSorted(int arr[]) {
       
        boolean res=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                 res=true;
            }
            else if(arr[i]<arr[i+1]){
                res=false;
            }
        }
        return res;
    }
    public static int sellbuy(int arr[]){
        int sum=0;
        int min=arr[0];
        if(isSorted(arr)){
            return 0;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arrr[]={2,4,1,3,6};
        int res=sellbuy(arrr);
        System.out.println(res);
    }
}
