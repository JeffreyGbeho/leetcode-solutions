// Last updated: 23/05/2025 19:03:35
class Solution {
    public String reverseVowels(String s) {
        HashMap<Character, Character> dict = new HashMap<Character, Character>();
        dict.put('a', 'a');
        dict.put('e', 'e');
        dict.put('i', 'i');
        dict.put('o', 'o');
        dict.put('u', 'u');
        dict.put('A', 'A');
        dict.put('E', 'E');
        dict.put('I', 'I');
        dict.put('O', 'O');
        dict.put('U', 'U');

        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (dict.get(s.charAt(l)) != null && dict.get(s.charAt(r)) != null) {
                sb.setCharAt(l, s.charAt(r)); 
                sb.setCharAt(r, s.charAt(l)); 
                l++;
                r--;
            } else if (dict.get(s.charAt(l)) == null && dict.get(s.charAt(r)) != null) {
                l++;
            } else if (dict.get(s.charAt(l)) != null && dict.get(s.charAt(r)) == null) {
                r--;
            } else {
                l++;
                r--;
            }
        } 

        return sb.toString();
    }
}