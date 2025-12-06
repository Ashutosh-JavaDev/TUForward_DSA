public class Unicode {
    public static int Unicode(String str,int index){
        return str.codePointAt(str.charAt(index));
    }
    public static void main(String[] args) {
        String str="Ashutosh Ayush";
        int res=Unicode(str, 4);
        System.out.println(res);
    }
}
