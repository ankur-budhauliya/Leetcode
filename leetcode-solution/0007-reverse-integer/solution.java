class Solution {
    public int reverse(int x) {
        boolean neg = x<0;

        String newS = "";
        String str = String.valueOf(Math.abs((long)x));
        for(int i = str.length()-1; i >= 0; i--){
            newS += str.charAt(i);
        }
        long result = Long.parseLong(newS);

        if(result > Integer.MAX_VALUE) {
            return 0;
        }
        return neg ? (int)-result : (int)result ;
    }

}
