import java.util.*;

public class FLOW007 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int temp = sc.nextInt();
            int res = 0;
            while (temp > 0) {
                res = res * 10 + (temp % 10);
                temp /= 10;
            }
            System.out.println(res);
        }
    }
}
