import java.util.HashSet;
import java.util.Arrays;
public class RemoveDuplicate {
    static HashSet<Integer> removeDuplicate(int arr[]) {
        HashSet <Integer> set=new HashSet<>();
        HashSet <Integer> dupli=new HashSet<>();

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                dupli.add(arr[i]);
            }  
        }
        return dupli;   
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,4,3,5,6,5};
        HashSet<Integer>res=removeDuplicate(arr);
        System.out.println(res);

    }
}
