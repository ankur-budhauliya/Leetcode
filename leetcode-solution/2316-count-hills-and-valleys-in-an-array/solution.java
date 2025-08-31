class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for (int x: nums){
            if (arr.isEmpty() || arr.get(arr.size() - 1) != x) {
                arr.add(x);
            }
        }

        int count = 0;
        for (int i = 1; i < arr.size() - 1; i++){
            if(arr.get(i)> arr.get(i-1) && arr.get(i)>arr.get(i+1)){
                count++;
            }
            if(arr.get(i)<arr.get(i-1) && arr.get(i)<arr.get(i+1)){
                count++;
            }
        }
        return count;
    }
}
