class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxLen = 0;
        
        int conLen = 0;
            
        for(int i = 0; i < nums.length; i++){
                
            if(nums[i] != 0){
                conLen++ ;
                maxLen = Math.max(maxLen, conLen);
            }else{
                    
                conLen = 0;
            }
        }
        
        return maxLen;
    }
}
