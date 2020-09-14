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
            System.out.println(Arrays.toString(plusOne(arr)));
        }
    }

    static int[] plusOne(int[] A) {
        int start = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                start = i;
                break;
            }
        }
        int carry = 1;
        for (int i = A.length - 1; i >= start; i--) {
            int temp = A[i] + carry;
            carry = temp / 10;
            A[i] = temp % 10;
        }
        if (carry > 0) {
            if (start > 0) {
                A[--start] = carry;
            } else {
                int[] temp = new int[A.length + 1];
                temp[0] = carry;
                for (int i = 1; i < temp.length; i++)
                    temp[i] = A[i - 1];
                return temp;
            }
        }
        return Arrays.copyOfRange(A, start, A.length);
    }
}