class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            Integer val = map.get(nums[i]);

            if(val != null){
                if(i-val<=k){
                    return true;

                }
            }
            map.put(nums[i], i);

        }
        return false;


        // List<Integer>list=new ArrayList<>();
        // for (int i = 0; i< nums.length; i++) {
        //     if (list.contains(nums[i])) {
        //         return true;
        //     }
        //     list.add(nums[i]);
        //     if(list.size()>k) {
        //         list.remove(0);
        //     }
        // }
        // return false;
    }
}
