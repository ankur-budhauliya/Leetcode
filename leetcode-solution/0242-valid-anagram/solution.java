class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sorted1 = new String(arr1);
        String sorted2 = new String(arr2);

        if(sorted1.equals(sorted2)){
            return true;

        }
        return false;
    }
}
