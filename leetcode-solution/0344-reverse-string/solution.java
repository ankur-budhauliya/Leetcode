class Solution {
    public void reverseString(char[] s) {
        char[] reversed = reverse(s, 0);

        for (int i = 0; i < s.length; i++) {
            s[i] = reversed[i];
        }
    }
    public char[] reverse(char[] s, int index){
        if(index == s.length){
            return new char[0];
        }
        char[] rest = reverse(s, index+1);

        char[] result = Arrays.copyOf(rest,rest.length+1);
        result[rest.length] = s[index];
        return result;
    }
}
