class Solution {
    public long maxProduct(int[] nums) {
        long max1=Long.MIN_VALUE;
        int indexmax1=-1;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])>max1){
                max1=Math.abs(nums[i]);
                indexmax1=i;
            }
        }
        long max2=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])>max2 && i!=indexmax1){
                max2=Math.abs(nums[i]);
            }
        }
        return max1*max2*100000L;
    }
}
