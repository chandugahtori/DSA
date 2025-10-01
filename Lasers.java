import java.util.*;

public class Lasers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();


            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }
            for (int i = 0; i <m; i++) {
                sc.nextInt();
            }
            int ans = (n+m);
            System.out.println(ans);


        }
    }
}
