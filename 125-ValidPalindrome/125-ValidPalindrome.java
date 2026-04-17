// Last updated: 17/04/2026, 15:12:00
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i = 0;
4        int j = s.length() - 1;
5
6        while (i < j) {
7            while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i))) {
8                i++;
9            }
10            while (j >= 0 && !Character.isLetterOrDigit(s.charAt(j))) {
11                j--;
12            }
13
14            if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
15                return false;
16            }
17
18            i++;
19            j--;
20        }
21
22        return true;
23    }
24}