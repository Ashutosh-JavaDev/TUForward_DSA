public class Unicode {
    public static int Unicode(String str,int index,int inx){
        return str.codePointCount(index,inx);
    }
    public static void main(String[] args) {
        String str="Ashutosh Ayush";
        int res=Unicode(str, 4,8);
        System.out.println(res);
    }
}
