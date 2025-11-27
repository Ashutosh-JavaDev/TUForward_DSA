import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    static void RemoveDuplicate(Integer arr[]){
        LinkedHashSet<Integer>set=new LinkedHashSet<>(Arrays.asList(arr));
  System.out.println(set);
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,3,2,5,5,3,4,2,4};
        RemoveDuplicate(arr);
    }
}
