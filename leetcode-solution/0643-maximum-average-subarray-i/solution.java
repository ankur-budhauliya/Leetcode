



class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double msum = Double.NEGATIVE_INFINITY;
        
        for(int i=0; i<=((nums.length)-k); i++){
              int count =0;
            for (int j = i; j < i + k; j++){
                    count+=nums[j];
            }   
            double currentAvg = (double) count/(double) k;
            msum = Math.max(msum, currentAvg);
        }
        return msum;
    }
}
