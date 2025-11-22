class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        String reverse = new StringBuilder(s).reverse().toString();

        
        int flips = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != reverse.charAt(i)){
                flips++;
            }
        }
        return flips;

        
    }
}
