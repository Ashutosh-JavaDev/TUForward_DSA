import java.util.Arrays;
import java.util.HashSet;

public class MergeSortedArray {
    public static void merge(int one[], int two[]) {
        HashSet<Integer> set = new HashSet<>();
        // Arrays.sort(one);
        // Arrays.sort(two);
        int value = one.length + two.length;
        int three[] = new int[value];
        int i = 0, j = 0,k=0;
        while (i < value) {
            three[k] = one[i];
            i++;
            k++;
            three[k] = two[j];
            j++;
            System.out.print(three[k]+" ");
        }
    }

    public static void main(String[] args) {
        int one[] = { 3, 2, 1, 34, 2 };
        int two[] = { 4, 5, 2, 5, 1 };

        int arr[];
        merge(one, two);
       
    }
}
