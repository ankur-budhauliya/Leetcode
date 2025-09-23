class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;  
        long sum = 0;  
        for (int p : piles) {
            max = Math.max(max, p);
            
        }
        int start =1;
        int end = max;
        int ans = max;

        while(start<=end){
            int mid = start +  (end-start)/2;

            long hours =0;
            for(int p: piles){
                hours += (p+mid-1)/mid;

            }
            if(hours<=h){
                ans =mid;
                end=mid-1;

            }
            else{
                start =mid+1;
            }


        }
        return ans;

    }
}
