import java.util.*;

public class Gold_rush {
    public static boolean canMake(long n, long m) {
        if (n == m) return true;
        if (n < m) return false;
        if (n % 3 != 0) return false;

        long a = n / 3;
        long b = 2 * n / 3;

        return canMake(a, m) || canMake(b, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            if (canMake(n, m)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
