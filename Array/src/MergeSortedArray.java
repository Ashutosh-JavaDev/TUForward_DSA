import java.util.HashSet;

public class MergeSortedArray {
    public static void merge(int one[],int two[]){
        HashSet <Integer>set=new HashSet<>();
        int x=one.length+two.length;
        for(int i=0;i<x;i++){
            set.add(one[i]);
            set.add(two[i]);
        }
        System.out.print(set+" ");
        System.out.println();
    }    
}
