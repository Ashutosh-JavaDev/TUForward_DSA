import java.util.HashSet;

public class SingleNumber {
    public static HashSet<Integer> check(int arr[]){
        HashSet<Integer>single=new HashSet<>();
       
     HashSet <Integer>dupli=new HashSet<>();
        if(arr.length%2==0){
            return -1;
        }
        else{
            for(int i=0;i<arr.length;i++){
                   if(!single.add(arr[i])){
                    dupli.add(arr[i]);
                   }

            }
        }
        return single;
    }   
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,5,2,4,5};
        HashSet <Integer>res=check(arr);
        System.out.println(res);
    }
}
