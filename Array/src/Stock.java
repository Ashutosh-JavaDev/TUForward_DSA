public class Stock {
    public static boolean buysell(int arr[]) {
        int sum = 0;
        boolean res=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return res;
            }
            else{
                res=false;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arrr[]={1,2,3,4,5};
        boolean res=buysell(arrr);
        System.out.println(res);
    }
}
