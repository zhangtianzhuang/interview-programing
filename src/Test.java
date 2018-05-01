import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(get(sc.nextInt()));
    }

    public static int get(int n){
        int sum = 1 ;
        int a = 1 ;
        int b = 0 ;
        for (int i = 2; i <= n; i++) {
            if (b==a){
                sum--;
                a++;
                b=0;
            }else {
                sum++;
                b++;
            }
        }
        return sum ;
    }
}
