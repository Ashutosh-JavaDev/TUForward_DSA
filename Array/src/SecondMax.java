public class SecondMax {
    static int second(int arr[]){
        int secmax=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax){
                secmax=arr[i];
                max=secmax;
            }
        }
        return secmax;
    }
    public static void main(String[] args) {
        int arr[]={32,12,43,2,42};
        int res=second(arr);
        System.out.println(res);
    }
}
