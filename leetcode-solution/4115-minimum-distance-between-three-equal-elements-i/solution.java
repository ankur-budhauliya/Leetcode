class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int min = Integer.MAX_VALUE;
        boolean found = false;

        for(List<Integer> inx :map.values()){
            if(inx.size() >= 3){
                found = true;
                for(int i = 0;i<= inx.size()-3; i++ ){
                    int first = inx.get(i);
                    int second = inx.get(i+1);
                    int third = inx.get(i+2);

                    int dis = 2*(third-first);
                    min = Math.min(min,dis);
                }
            }
        }
        return found? min : -1;
    }
}
