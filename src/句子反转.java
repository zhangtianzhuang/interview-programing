import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 句子反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            List<String> strings = Arrays.asList(arr);
            Collections.reverse(strings);
            for (String string : strings) {
                System.out.print(string+" ");

            }
        }
    }
}
