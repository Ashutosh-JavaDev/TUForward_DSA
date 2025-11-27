import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    static void RemoveDuplicate(Integer arr[]){
        HashSet<Integer>set=new HashSet<>(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,3,2,3,4,2,4};
        RemoveDuplicate(arr);
    }
}
