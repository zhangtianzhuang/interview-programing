import java.util.Scanner;

public class 字符判断 {
    public static void main(String[] args) {
//        System.out.println("张天壮fddd".length());
        test();
    }

    public static void test(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int flag = 1 ;
        for (int i = 0; i < b.length(); i++) {
            String s = String.valueOf(b.charAt(i));
            if (a.contains(s)){
                a = a.replaceFirst(s,"");
            }else{
                flag = 0 ;
                break;
            }
        }
        System.out.println(flag);
    }

}
