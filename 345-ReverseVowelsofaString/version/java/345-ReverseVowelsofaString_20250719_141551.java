// Last updated: 19/07/2025 14:15:51
/*
 * O(n)
 * 
 * Two pointers method
*/

class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        int i = 0;
        int j = s.length() - 1;

        StringBuilder res = new StringBuilder(s);

        while( i < j) {
            if (vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(j))) {
                res.setCharAt(i, s.charAt(j));
                res.setCharAt(j, s.charAt(i));
                i++;
                j--;
            }

            if (!vowels.contains(s.charAt(i))) {
                i++;
            }

            if (!vowels.contains(s.charAt(j))) {
                j--;
            }
        }

        return res.toString();
        
    }
}