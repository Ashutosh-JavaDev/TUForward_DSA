public class CompareTo {
    public static int compare(String str1,String str2){
        return str1.compareTo(str2);
    }
    public static void main(String[] args) {
        String str="Ashutosb";
        String str2="Ashutosu";
        int res=compare(str, str2);
        System.out.println(res);
    }
}
