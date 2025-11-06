public class LargestNumber {
   static int Largest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) throws Exception {
        int result=Largest(arr);
        System.out.println(result);
    }
}
