import java.util.Arrays;
import java.util.Scanner;

public class 喷水装置 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] radius = new double[n];
        for (int i = 0; i < n; i++) {
            radius[i] = sc.nextDouble();
        }
        Arrays.sort(radius);
        double sum = 0 ;
        int l = n ;
        int c = 0 ;
        while(sum<=10){
            double len = Math.sqrt(radius[l-1]*radius[l-1] - 1);
            sum += len ;
            l--;
            c++;
        }
        System.out.println(c);
    }
}
