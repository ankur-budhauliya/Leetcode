class Solution {
    long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long countOdd = n / 2;
        long countEven = (n+1)/2;
        long p1 = power(4,countOdd);
        long p2 = power(5,countEven);
        return (int)((p1 * p2) % mod) ;

    }
    public long power(long x,long n){
        if(n == 0) return 1;
        long half = power(x, n/2);
        long ans = (half * half) % mod;

        if(n % 2 == 1){
            ans = (ans * x) % mod;
        }
        return ans % mod;
        
    }
} 
