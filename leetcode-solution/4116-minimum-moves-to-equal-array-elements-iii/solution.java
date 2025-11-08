class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        int start = nums[0];
        int end = nums[n-1];
        for(int i=0; i<n;i++){
            if(nums[i] == nums[n-1]) continue;
            else{
                while(nums[i]!= end){
                    nums[i]++;
                    count++;
                }
            }
        }
        return count;
    }
}
