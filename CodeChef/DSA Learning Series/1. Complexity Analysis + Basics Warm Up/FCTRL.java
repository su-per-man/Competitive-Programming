import java.util.*;

public class FCTRL {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int f = 1, temp = 5, count = 0;
            while (n / temp != 0) {
                count += n / temp;
                temp = (int) Math.pow(5, ++f);
            }
            System.out.println(count);
        }
    }
}