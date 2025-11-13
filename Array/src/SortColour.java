import java.util.Arrays;
public class SortColour {
    public static void check(int arr[]){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,0};

        check(arr);
    }
}
