// Last updated: 21/07/2025 12:59:10
/*
 * O(n)
 * 
 * Easy !
*/

class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

        int c = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                c++;
            }
        }

        int res = c;

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                c++;
            }
            if (vowels.contains(s.charAt(i-k))) {
                c--;
            }

            res = Math.max(res, c);
        }

        return res;
    }
}