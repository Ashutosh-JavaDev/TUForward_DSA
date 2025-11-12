import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static int check(int arr[]) {
        HashSet<Integer> single = new HashSet<>();

        HashSet<Integer> dupli = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!single.add(arr[i])) {
                dupli.add(arr[i]);
            }

        }
        Set<Integer> onlyInSet1 = new HashSet<>(single);

        onlyInSet1.removeAll(dupli);
        if (onlyInSet1.isEmpty()) {
            return -1;
        }

        return onlyInSet1.iterator().next();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2,4,3,1,4 };
        int res = check(arr);
        System.out.println(res);
    }
}
