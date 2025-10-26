class Solution {
    public long removeZeros(long n) {
        String noZero = String.valueOf(n).replace("0", "");
        return Long.parseLong(noZero);
    }
    
    
}
