// Last updated: 20/05/2025 22:55:35
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