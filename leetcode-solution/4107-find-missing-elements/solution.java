class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< nums.length-1; i++){
            int current = nums[i];
            int next = nums[i+1];
            for(int missing = current + 1; missing < next; missing ++){
                list.add(missing);
            }
        }
        return list;
    }
}
