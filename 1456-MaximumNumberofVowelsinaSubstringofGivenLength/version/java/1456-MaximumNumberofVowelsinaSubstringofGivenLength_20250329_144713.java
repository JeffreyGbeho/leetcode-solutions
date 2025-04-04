// Last updated: 29/03/2025 14:47:13
class Solution {
    public int maxVowels(String s, int k) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int res = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += vowels.contains(s.charAt(i)) ? 1 : 0;
        } 
        res = Math.max(res, sum);

        for (int i = k; i < s.length(); i++) {
            sum -= vowels.contains(s.charAt(i-k)) ? 1 : 0;
            sum += vowels.contains(s.charAt(i)) ? 1 : 0;
            res = Math.max(res, sum);
        }

        return res;
    }
}