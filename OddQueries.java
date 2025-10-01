import java.util.*;

public class OddQueries {
    public static void odd_q() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] arr = new long[n + 1];    
            long[] prefix_sum = new long[n+1]; 


            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextLong();
                prefix_sum [i] = prefix_sum [i - 1] + arr[i];
            }

            long total = prefix_sum[n]; 

    
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();

                long sum_lr = prefix_sum [r] - prefix_sum[l - 1];
                long len = r - l + 1;
                long newTotal = total - sum_lr + k * len;

                if (newTotal % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        odd_q();
    }
}
