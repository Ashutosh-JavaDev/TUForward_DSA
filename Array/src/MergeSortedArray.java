import java.util.Arrays;
import java.util.HashSet;

public class MergeSortedArray {
    public static void merge(int one[], int two[]) {
        HashSet<Integer> set = new HashSet<>();
        int value=one.length+two.length;
       int three[]=new int[value];
       
    }

    public static void main(String[] args) {
        int one[] = { 3, 2, 1, 34, 2 };
        int two[] = { 4, 5, 2, 5, 1 };
        merge(one, two);
       
    }
}
