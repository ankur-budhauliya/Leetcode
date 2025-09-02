class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n=nums.length;
        int[] result = new int[n];

        for(int i=0; i<n;i++){
            if (i - k < 0 || i + k >= n) {
                result[i] = -1;
            } else {
                long sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = (int)(sum / (2 * k + 1));
            }
        }
        return result;
    }
}
