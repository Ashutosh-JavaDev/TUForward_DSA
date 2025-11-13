
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int arr[],int target){
    
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int need = target - num;

            if (map.containsKey(need)) {
                return new int[]{ map.get(need), i };
            }

            map.put(num, i);
        }
        return null;
        }
    public static void main(String[] args) {
        
        int arr[]={1,6,10,2,3};
        int res[]=twoSum(arr, 7);
        System.out.println(Arrays.toString(res));

    }
}
