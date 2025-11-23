class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int n = nums.length;
        Map<String, Integer> map = new HashMap<>();

        int x = 0;
        int remain = 0;
        int maxLen = 0;
        map.put("0#0",-1);
        for(int i =0; i<nums.length;i++){
            x ^= nums[i];
            if(nums[i] %2 == 0) remain--;
            else remain ++;
            String key = x + "#" + remain;
            if(map.containsKey(key)){
                maxLen = Math.max(maxLen, i -map.get(key));
                
            }else{
                map.put(key,i);
            }
        }
        return maxLen;
    }
}
