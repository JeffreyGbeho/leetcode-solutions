// Last updated: 03/10/2025 19:44:00
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <n; i++) {
            if (haystack.charAt(i) == needle.charAt(0) && i + m-1 < n ) {
                for (int j =  0; j < m; j++) {
                    if (haystack.charAt(i+j) != needle.charAt(j)) {
                        break;
                    }
                    if (j == m-1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}