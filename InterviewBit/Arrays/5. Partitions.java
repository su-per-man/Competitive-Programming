import java.util.*;
import java.io.*;

class InterviewBit {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            System.out.println(findEqualPartitionWays(arr, n));
        }
    }

    static int findEqualPartitionWays(int[] A, int n) {
        int ways = 0;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += A[i];
        if (sum % 3 != 0)
            return 0;
        sum /= 3;
        int sufSumCount[] = new int[n];
        int tempSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            tempSum += A[i];
            sufSumCount[i] = (tempSum == sum ? 1 : 0);
        }
        for (int i = n - 2; i >= 0; i--)
            sufSumCount[i] += sufSumCount[i + 1];
        tempSum = 0;
        for (int i = 0; i < n - 2; i++) {
            tempSum += A[i];
            if (tempSum == sum)
                ways += sufSumCount[i + 2];
        }
        return ways;
    }
}
