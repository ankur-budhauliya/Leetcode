import java.util.HashSet;
import java.util.Set;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> numset = new HashSet<>();
        for (int num: nums){
            numset.add(num);
        }
        int multiple = k;
        while(true){
            if(!numset.contains(multiple)){
                return multiple;
            }
            multiple += k;
        }
    }
}
