class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int n : nums){
            sum += n;
            if (sum > maxSum){
                maxSum = sum;
                
            }
            if(sum < 0){
                    sum = 0;
                }
            
        }
        return maxSum;
        // int maxSum = Integer.MIN_VALUE;

        // for(int i =0; i< nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if (sum > maxSum){
        //             maxSum = sum;

        //         }
                
        //     }

        // }
        // return maxSum;
    }
}
