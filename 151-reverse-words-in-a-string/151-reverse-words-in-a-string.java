// Last updated: 18/05/2025 11:27:10
class Solution {
    public String reverseWords(String s) {
        String[] splt = s.split(" +");
        String res = "";

        for (int i = splt.length-1; i >= 0; i--) {
            res += " " + splt[i];
        }

        return res.trim();
    }
}