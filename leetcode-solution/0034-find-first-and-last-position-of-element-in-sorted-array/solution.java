class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=findFirst(nums,target);
        ans[1]=findLast(nums,target);
        return ans;
    }
    private int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;
            while (start <= end){
                int mid = start + (end-start)/2;
                if(target < nums[mid]){
                    end = mid-1;
                }else if (nums[mid]<target){
                    start = mid+1;
                }else{
                    ans= mid;
                    end=mid-1;
                }
            }
            return ans;
        }       
    private int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if (nums[mid]<target){
                start = mid+1;
            }else{
                ans= mid;
                start=mid+1;
            }
        }
        return ans;
    }
}
