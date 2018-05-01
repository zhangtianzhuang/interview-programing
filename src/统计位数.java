import java.util.Scanner;

public class 统计位数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int x = 0; x < n; x++) {
            String num = arr[x];
            int realNum = Integer.parseInt(num);
            int l = num.length();
            if (l==1){
                System.out.println(realNum);
            }else{
                long sum = 0 ;
                for (int i = 1; i <= l - 1; i++) {
                    sum += i*get(i);
                }
                int has = l*(realNum-build(l-1));
                sum+=has ;
                System.out.println(sum);
            }
        }
    }
    public static int get(int n){
        if (n==1){
            return 9;
        }else{
            StringBuffer sb = new StringBuffer();
            sb.append("9");
            for (int i = 0; i < n-1; i++) {
                sb.append("0");
            }
            return Integer.parseInt(sb.toString());
        }
    }
    public static int build(int n){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("9");
        }
        return Integer.parseInt(sb.toString());
    }
}
