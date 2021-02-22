import java.util.*;

public class ZCO14003 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0;
        long[] arr = new long[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long max = 0;
        for (i = 0; i < n; i++) {
            if (max < arr[i] * (n - i))
                max = arr[i] * (n - i);
        }
        System.out.println(max);
    }
}