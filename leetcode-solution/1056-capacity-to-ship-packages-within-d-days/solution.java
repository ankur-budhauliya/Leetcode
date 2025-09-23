class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;  
        int sum = 0;  
        for (int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }
        int start = max;
        int end = sum;
        int ans =sum;
        while(start<=end){
            int mid = start +  (end-start)/2;

            int daysUsed =1;
            int load =0;
            

            for(int w: weights){
                if(load+w>mid){
                    load=0;
                    daysUsed++;
                }
                load+=w;
            }
            if(daysUsed<=days){
                ans = mid;
                end = mid-1;
                
            }else{
                
                start= mid+1;
            }

        }

        // for (int cap = max; cap <= sum; cap++) {
        //     int daysUsed = 1;
        //     int load = 0;
        //     for (int w:weights) {
        //         if (load+w>cap) { 
        //             daysUsed++;
        //             load = 0;
        //         }
        //         load+= w;
        //     }

        //     if (daysUsed<= days) {
        //         return cap; 
        //     }
        // }

        return ans; 
    }
}

