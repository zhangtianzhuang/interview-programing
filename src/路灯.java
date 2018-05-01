import java.util.Arrays;
import java.util.Scanner;

public class 路灯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,l ;
        n = sc.nextInt();
        l = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double max = 0;
        for (int i = 0; i < n - 1; i++) {
            int d = arr[i+1]-arr[i];
            if (d>max){
                max = d;
            }
        }
        if (arr[0]!=0 && arr[0]*2>max){
            max=arr[0]*2;
        }
        if (arr[n-1]!=l && (l-arr[n-1])*2>max){
            max = (l-arr[n-1])*2;
        }
        System.out.println(String.format("%.2f",max/2));
    }
}
