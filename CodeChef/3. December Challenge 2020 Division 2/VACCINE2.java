import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.StringTokenizer;

public class VACCINE2 {
    public static void main(String args[]) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            double risk = 0;
            for (int i = 0; i < n; i++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp >= 80 || temp <= 9)
                    risk++;
            }
            System.out.println((int) (Math.ceil(risk / d) + Math.ceil((n - risk) / d)));
        }
    }
}
