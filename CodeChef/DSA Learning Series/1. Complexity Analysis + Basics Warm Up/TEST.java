import java.util.*;

public class TEST {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int temp = sc.nextInt();
            if (temp == 42)
                break;
            else
                System.out.println(temp);
        }
    }
}