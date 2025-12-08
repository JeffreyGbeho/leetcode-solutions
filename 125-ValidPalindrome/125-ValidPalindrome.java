// Last updated: 08/12/2025 14:00:41
1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder sb = new StringBuilder();
4        for (Character c : s.toCharArray()) {
5            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
6                sb.append(c);
7            }
8        }
9
10        String original = sb.toString().toLowerCase();
11        String reverse = sb.reverse().toString().toLowerCase();
12
13        return original.equals(reverse);
14    }
15}