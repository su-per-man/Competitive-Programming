import java.util.*;

public class LAPIN {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = (sc.next()).toUpperCase();
            int mid = str.length() / 2;
            int i = mid - 1, j = (str.length() % 2 != 0 ? mid + 1 : mid);
            mid = i;
            int[] freq1 = new int[26];
            int[] freq2 = new int[26];
            for (; i >= 0 && j < str.length(); i--, j++) {
                freq1[str.charAt(i) - 'A']++;
                freq2[str.charAt(j) - 'A']++;
            }
            for (i = 0; i <= mid; i++) {
                int c = str.charAt(i) - 'A';
                if (freq1[c] != freq2[c]) {
                    System.out.println("NO");
                    break;
                }
            }
            if (i > mid)
                System.out.println("YES");
        }
    }
}