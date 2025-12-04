class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n <= 3) return n;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // Memorisation 
    // public int climbStairs(int n) {
    //     int[] dp = new int[n+1];
    //     return solve(n, dp);
    // }
    // public int solve(int n, int dp[]){
    //     if(n <= 3) return n;
    //     if(dp[n] != 0) return dp[n];
    //     return dp[n] = solve(n-1, dp) + solve(n-2, dp);
    // }
}
