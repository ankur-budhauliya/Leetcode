class Solution {
    public boolean isPalindrome(int x) {

        if (x<0) return false;
        String str = String.valueOf(x);

        int n = str.length()-1;
        for(int i = 0, j = n; i<=n && j>=0; i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
