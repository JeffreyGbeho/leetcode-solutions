// Last updated: 03/10/2025 19:43:35
class Solution {
    public boolean isSubsequence(String s, String t) {
        int l = 0;
        int r = 0;

        while (r < s.length() && l < t.length()) {
            if (t.charAt(l) == s.charAt(r)) {
                r++;
            }
            l++;
        }

        return r >= s.length();
    }
}