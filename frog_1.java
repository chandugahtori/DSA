
import java.util.*;
public class frog_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] =  sc.nextInt();
        }
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[1] - arr[0]);

        for (int i = 2; i < n; i++) {
            int jump1 = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int jump2 = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            dp[i] = Math.min(jump1, jump2);
        }

        System.out.println(dp[n-1]);

       sc.close();

    }
}
