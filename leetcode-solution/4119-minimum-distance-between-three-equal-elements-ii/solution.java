class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, Deque<Integer>> map = new HashMap<>();
        int minD = Integer.MAX_VALUE;
        boolean found = false;

        for(int i = 0; i< nums.length; i++){
            map.putIfAbsent(nums[i], new ArrayDeque<>());
            Deque<Integer> dq = map.get(nums[i]);
            dq.addLast(i);

            if(dq.size() == 3){
                found = true;
                int dist = 2*(dq.peekLast() - dq.peekFirst());
                minD = Math.min(minD,dist);
                dq.pollFirst();
                
                
            }
        }
        return found? minD : -1;
    }
}
