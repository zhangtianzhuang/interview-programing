import java.util.Scanner;

/**
 * @author 张天壮
 * Created by zhangtianzhuang on 2018/4/20.
 */
public class 上台阶 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            System.out.println(fun(sc.nextInt()));
        }
    }

    public static int fun(int n){
        if (n==2){
            return 1 ;
        }else if (n==3){
            return 2 ;
        }else {
            return fun(n-2) + fun(n-1);
        }
    }
}
