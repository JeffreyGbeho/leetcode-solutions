// Last updated: 23/05/2025 18:46:21
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int frequency = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            frequency = Math.max(frequency, map.get(num));
        }

        int res = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == frequency) {
                res++;
            }
        }

        return res * frequency;
    }
}