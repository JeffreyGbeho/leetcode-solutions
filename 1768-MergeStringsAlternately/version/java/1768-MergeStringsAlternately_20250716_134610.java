// Last updated: 16/07/2025 13:46:10
/*
 * O(n)
 * 
 * I pick the length of the longest string and alternate between both to get my merged string.
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = Math.max(word1.length(), word2.length());
        String res = "";

        for (int i = 0; i < l; i++) {
            res += i < word1.length() ? word1.charAt(i) : "";
            res += i < word2.length() ? word2.charAt(i) : "";
        }

        return res;
    }
}