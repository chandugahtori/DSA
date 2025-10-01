

public class Knapsack {

    public static int knapsack(int W, int val[], int wt[]) {
        
        int n = val.length;
        int dp[][] = new int [n+1][W+1];
        
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }
        
        
        return ks_helper(n, W, val, wt, dp);
    }
    
    public static int ks_helper(int n , int W, int val[],int wt [], int dp[][]){  
      
        if(W<=0 || n ==0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <=W){
            int Pick = val[n-1] + ks_helper(n-1, W-wt[n-1], val , wt,dp);
            int Not_Pick = ks_helper(n-1,W, val , wt,dp);
            dp[n][W] = Math.max(Pick,Not_Pick );
        }else {
            dp[n][W] = ks_helper(n-1, W, val, wt, dp);
        }
        return dp[n][W];
    }
}


