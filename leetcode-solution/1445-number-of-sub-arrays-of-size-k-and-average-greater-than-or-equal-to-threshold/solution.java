class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double msum = Double.NEGATIVE_INFINITY;
        int count =0;
        for(int i=0; i<=arr.length-k; i++){
            int sum=0;
            for (int j = i; j < i + k; j++){
                sum+=arr[j];
            }   
            double currentAvg = (double) sum / k;
            if (currentAvg >= threshold){
                count++;
            }
            
        }
        return count;
    }
}
