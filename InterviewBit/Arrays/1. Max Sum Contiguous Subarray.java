//SOlved using Kadane Algorithm

import java.lang.*;
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
            System.out.println(maxSubArray(arr));
        }
    }

    public static int maxSubArray(int[] A) {
        int tempSum = A[0];
        int maxSum = A[0];
        for (int k = 1; k < A.length; k++) {
            tempSum = Math.max(A[k], tempSum + A[k]);
            maxSum = Math.max(maxSum, tempSum);
        }
        return maxSum;
    }
}
