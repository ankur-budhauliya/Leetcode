class Solution {
    public String lexGreaterPermutation(String s, String target) {
        String quinorath = s + "|" + target;

        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        StringBuilder result = new StringBuilder();
        if (helper(result, freq, target.toCharArray(), 0, false)) {
            return result.toString();
        }
        return "";
    }

    private boolean helper(StringBuilder res, int[] freq, char[] target, int i, boolean greater) {
        int n = target.length;
        if (i == n) return greater; // built all positions

        for (int c = 0; c < 26; c++) {
            if (freq[c] == 0) continue;

            char ch = (char) (c + 'a');

            boolean nextGreater = greater || (ch > target[i]);
            if (!greater && ch < target[i]) continue;

            // use this char
            freq[c]--;
            res.append(ch);

            // prune early: if we haven’t yet exceeded target but char == target[i]
            if (helper(res, freq, target, i + 1, nextGreater)) {
                return true;
            }

            // backtrack
            res.deleteCharAt(res.length() - 1);
            freq[c]++;
        }

        return false;
    }
}
