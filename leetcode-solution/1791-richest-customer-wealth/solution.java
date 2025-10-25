class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] acc : accounts){
            int sum =0;
            for(int i =0; i < acc.length; i++){
                sum += acc[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
