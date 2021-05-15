import java.io.*;
import java.lang.*;
import java.util.*;

public class INCR_SUBSTR {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int t = Integer.parseInt(br.readLine());
        for (int k = 1; k <= t; k++) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int count = 1;
            for (int i = 0; i < n; i++) {
                if (i == 0)
                    System.out.print("Case #" + k + ": ");
                else if (str.charAt(i) > str.charAt(i - 1))
                    count++;
                else
                    count = 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}