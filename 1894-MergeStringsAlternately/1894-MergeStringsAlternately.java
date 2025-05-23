// Last updated: 23/05/2025 21:25:15
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int maxL = l1 >= l2 ? l1 : l2;
        String res = "";

        for (int i = 0; i < maxL; i++) {
                if (i < l1) {
                    res += word1.charAt(i);
                }
                if (i < l2) {
                    res += word2.charAt(i);
                }
        }

        return res;
    }
}