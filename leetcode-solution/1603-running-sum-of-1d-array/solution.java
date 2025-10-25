class Solution {
    public int[] runningSum(int[] nums) {
        int sum =0;
        ArrayList<Integer> ListSum = new ArrayList<>();
        for(int i =0; i< nums.length; i++){
            sum += nums[i];
            ListSum.add(sum);
        }
        return ListSum.stream().mapToInt(Integer::intValue).toArray();
    }
}
