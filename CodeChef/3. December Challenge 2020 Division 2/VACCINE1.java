import java.util.*;
import java.lang.*;
import java.io.*;

class VACCINE1 {
	public static void main(String[] args) throws java.lang.Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int D1 = Integer.parseInt(st.nextToken());
		int V1 = Integer.parseInt(st.nextToken());
		int D2 = Integer.parseInt(st.nextToken());
		int V2 = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		System.out.println(D1 <= D2 ? calculateDays(D1, V1, D2, V2, P) : calculateDays(D2, V2, D1, V1, P));
	}

	public static int calculateDays(int d1, int v1, int d2, int v2, int p) {
		int noProdDays = d1 - 1;
		int temp = noProdDays + p / v1 + (p % v1 == 0 ? 0 : 1);
		if (temp < d2)
			return temp;
		int d1prod = (d2 - d1) * v1;
		p -= d1prod;
		return noProdDays + (d2 - d1) + p / (v1 + v2) + (p % (v1 + v2) == 0 ? 0 : 1);
	}
}