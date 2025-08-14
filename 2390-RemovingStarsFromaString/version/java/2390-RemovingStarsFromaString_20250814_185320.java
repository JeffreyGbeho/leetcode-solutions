// Last updated: 14/08/2025 18:53:20
/*
 * O(n)
 * 
 * Easy when using stringbuilder
*/

class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != '*') {
                res.append(c);
            } else {
                res.deleteCharAt(res.length() - 1);
            }
        }

        return res.toString();
    }
}