class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r =0;
        int zero =0;
        int m_length =0;

        while(r < nums.length){
            if (nums[r] == 0){
                zero++;
            
            }
            if(zero<=k)
            m_length = Math.max(m_length,r-l+1);

            while(zero>k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            r++;
        }
        
        
        return m_length;
        

    }
}
