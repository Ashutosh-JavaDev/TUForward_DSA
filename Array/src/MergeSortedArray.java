
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MergeSortedArray {
    public static void merge(int one[], int two[]) {
        HashSet<Integer> set = new HashSet<>();
        int value=one.length+two.length;
       int three[]=new int[value];
       int k=0;
       for(int i=0;i<one.length;i++){
        three[k]=one[i];
        set.add(three[k]);
        k++;
       }
       for(int i=0;i<two.length;i++){
        three[k]=two[i];
        set.add(three[k]);
        k++;
       }
       System.out.print(set+" ");
         Set<Integer> sortedSet = new TreeSet<>(set);
         System.out.println();
       System.out.print(sortedSet+" ");

    }

    public static void main(String[] args) {
        int one[] = { 3, 2, 1, 34, 2 };
        int two[] = { 4, 5, 2, 5, 1 };
        merge(one, two);
       
    }
}
