// Last updated: 23/05/2025 19:02:38
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                res += key;
            }
        }

        return res;
    }
}