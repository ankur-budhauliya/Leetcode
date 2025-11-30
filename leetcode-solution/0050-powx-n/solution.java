class Solution {
    public double myPow(double x, int n) {
        if(n < 0) {
            return 1/Power(x,-n);
        }

        return Power(x,n);
    }
    double Power(double x, int n){
        if(n ==0) return 1;

        
        double half = Power(x,n/2);
        if(n % 2 ==0){
            return half*half;
        }
        else{
            return half * half * x;
        }
    }
}
