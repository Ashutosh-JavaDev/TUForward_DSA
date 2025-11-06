import java.util.HashSet;

public class RemoveDuplicate {
    static HashSet<Integer> removeDuplicate(int arr[]) {
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set;   
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,4,3,5,6,5};
        HashSet<Integer>res=removeDuplicate(arr);
        System.out.println(res);

    }
}
