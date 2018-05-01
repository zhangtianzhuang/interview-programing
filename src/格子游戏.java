import java.util.Scanner;

public class 格子游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m ;
        n = sc.nextInt();
        m = sc.nextInt();
        //格子数组
        int[] arr = new int[n];
        // 保存结果
        int[] result = new int[m];
        int index = 0 ;
        //给数组赋权值
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // m次操作
        for (int i = 0; i < m; i++) {
            int o = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();
            if (o==1){
                continue;
            }else if (o==2){
                int sum = 0 ;
                for (int j = start-1; j < end ; j++) {
                    sum += arr[j];
                }
                result[index++] = sum;
            }else if (o==3){
                int last = -1;
                for (int j = start-1; j < end ; j++) {
                    if (arr[j]>last){
                        last = arr[j];
                    }
                }
                result[index++] = last ;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(result[i]);
        }
    }
}