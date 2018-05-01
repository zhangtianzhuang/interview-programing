import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LX {
    public LX(){}
    public LX(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int a ;
    public int b ;
}

public class 认老乡 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            //人数
            int n = sc.nextInt();
            //组数
            int m = sc.nextInt();
            if (m==0&&n==0){
                break;
            }
            List<Integer> lx = new ArrayList<>();
            List<LX> all = new ArrayList<>();
            lx.add(1);
            int index = 0 ;
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                all.add(new LX(a,b));
            }
            // 开始查找老乡了
            while(index<=lx.size()-1){
                for (LX lao : all) {
                    if (lao.a==lx.get(index)){
                        if (!lx.contains(lao.b)){
                            lx.add(lao.b);
                        }
                    }else if (lao.b==lx.get(index)){
                        if (!lx.contains(lao.a)){
                            lx.add(lao.a);
                        }
                    }
                }
                index++;
            }
            System.out.println(index-1);
        }
    }
}
