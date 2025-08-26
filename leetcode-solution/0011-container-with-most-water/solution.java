class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int max = 0;
        while(i<j){
            int sum = Math.min(height[i] , height[j]) * (j-i);
            if(sum > max){
                max = sum;
            }
            if(height[i] > height[j]) j--;
            else i++;
        }
        return max;
    }
}
