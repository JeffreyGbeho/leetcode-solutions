class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int index = 0, res = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                res = Math.max(res, count);
                map = new HashMap<>();
                count = 0;
                index++;
                i = index;
            }
                
            map.put(s.charAt(i), 0);
            count++;
        }
                
"abcabcbb"
