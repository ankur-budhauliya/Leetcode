class Solution {
    public int longestBalanced(int[] nums) {
        
        int maxlen = 0;
        for(int i = 0; i< nums.length; i++){
            Set<Integer> evenset = new HashSet<>();
            Set<Integer> oddset = new HashSet<>();
            
            for(int j = i; j< nums.length; j++){

                if (nums[j] % 2 == 0)
                    evenset.add(nums[j]);
                else
                    oddset.add(nums[j]);

                
                if (evenset.size() == oddset.size()){
                    int len = j-i+1;
                    maxlen = Math.max(maxlen, len);
                }
            }
        }
        return maxlen;
    }
}
