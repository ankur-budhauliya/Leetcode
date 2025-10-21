class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                right++;
                maxLen = Math.max(maxLen, set.size());

            }else{
                set.remove(s.charAt(left));
                left++;
            }
            
        }
        return maxLen;
    }
}
