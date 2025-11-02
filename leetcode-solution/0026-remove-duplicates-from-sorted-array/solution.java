class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        List<Integer> list = new ArrayList<>();
        int i = 0;
    
        for(int j =1; j< nums.length;j++){
            
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums [j];
                
            }
            if (i == 0 || nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }
        return i+1;
    }
}
