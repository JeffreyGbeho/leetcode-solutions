// Last updated: 30/07/2026, 22:21:44
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