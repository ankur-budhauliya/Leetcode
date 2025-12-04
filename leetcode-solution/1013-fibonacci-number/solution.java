class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        if(n <= 1) return n;
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    // Memoization
    // public int fib(int n) {
    //     int[] dp = new int[n + 1];
    //     return fibonacci(n, dp);
    // }
    
    // public int fibonacci(int n, int[] dp) {
    //     if (n <= 1)
    //         return n;
    //     if (dp[n] != 0)
    //         return dp[n];
    //     return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);

    // }
}
