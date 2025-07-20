// Last updated: 20/07/2025 11:54:09
/*
 * O(n+m)
 * 
 * easy !
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;

            while (!found && j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                }
                j++;
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}