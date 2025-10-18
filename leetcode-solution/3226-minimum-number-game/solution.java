class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int [] result = new int[nums.length];
        int index = 0;

        for(int i = 0; i<nums.length; i+=2){
            int a = nums[i];
            int b = nums[i+1];
            result[index++] = b;
            result[index++] = a;
        }
        return result;
    }
}
