import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CARVANS {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1])
                    count++;
                else
                    arr[i] = arr[i - 1];
            }
            System.out.println(count);
        }
    }
}