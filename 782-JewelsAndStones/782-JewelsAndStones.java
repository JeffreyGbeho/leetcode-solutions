// Last updated: 20/05/2025 23:23:31
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
        }
        
        int res = 0;
        for (int i = 0; i < jewels.length(); i++) {
            res += map.getOrDefault(jewels.charAt(i), 0);
        }
        
        return res;
    }
}