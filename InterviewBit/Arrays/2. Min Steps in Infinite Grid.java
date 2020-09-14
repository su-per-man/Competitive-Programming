import java.util.*;
import java.io.*;

class InterviewBit {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arrA = new int[n];
            int[] arrB = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                arrA[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                arrB[i] = Integer.parseInt(st.nextToken());
            System.out.println(coverPoints(arrA, arrB));
        }
    }

    static int coverPoints(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            count += Math.max(Math.abs(A[i] - A[i + 1]), Math.abs(B[i] - B[i + 1]));
        }
        return count;
    }
}