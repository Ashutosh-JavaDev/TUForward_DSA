// import java.util.Math;
public class Armstrong {
    public static boolean isArmstrong(int num) {
        boolean res = true;
        int n = num, len = 0;
        while (n != 0) {
            n = n / 10;
            len = len + 1;
        }
        int rev = 0, val = num;
        double dig = 0, sum = 0;
        while (val != 0) {
            rev = val % 10;
            dig = Math.pow(rev, len);
            sum = sum + dig;
            val = val / 10;
        }
        if (sum == num) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int num=153;
        boolean res=isArmstrong(num);
        System.out.println(res);
    }
}
