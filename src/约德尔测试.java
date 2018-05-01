import java.text.DecimalFormat;
import java.util.Scanner;

public class 约德尔测试 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        double c = 0 ;
        int s = a.length();
        for (int i = 0; i < s; i++) {
            if ((isLetterOrNumber(a.charAt(i))&& b.charAt(i)=='1')||(!isLetterOrNumber(a.charAt(i))&& b.charAt(i)=='0')){
                c++;
            }
        }
        double r = c/s;
        DecimalFormat df = new DecimalFormat("0.00%");
        String result = df.format(r);
        System.out.println(result);
    }

    public static boolean isLetterOrNumber(char ch){
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')){
            return true;
        }
        return false;
    }
}
