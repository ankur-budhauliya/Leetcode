class Solution {
    public long sumAndMultiply(int n) {
        
    String s = String.valueOf(Math.abs(n));
        long x =0L;
        for(char c: s.toCharArray()){
            if(c!= '0'){
                x = x*10+(c-'0');
            }
        }
        if(x == 0L) return 0L;

        long sum = 0L;
        long temp = x;
        while(temp>0){
            sum += temp%10;
            temp/=10;
        }
        return sum*x;
    }
}
