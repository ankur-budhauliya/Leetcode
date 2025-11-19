class Solution {
    
    public int[] split(List<Integer> nums, int num){
        if(nums.size() == 1){
            return new int[] {nums.get(0)};
        }
        int mid = nums.size()/2;
        List<Integer> leftList =  nums.subList(0,mid);
        List<Integer> rightList = nums.subList(mid,nums.size());

        int[] left = split(new ArrayList<>(leftList),0);
        int[] right = split(new ArrayList<>(rightList),0);

        return merge(left, right);

    }
    public int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }
    public int[] sortArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            list.add(x);
        } 

        return split(list, 0);
    }
}
