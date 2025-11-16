class Solution {
    public int minLengthAfterRemovals(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int n = s.length();
        int maxFreq = 0;
        
        for (int f : map.values()) {
            maxFreq = Math.max(maxFreq, f);
        }
        if (maxFreq <= n / 2) {
            return n % 2;
        }
        return 2 * maxFreq - n;
    }
}
