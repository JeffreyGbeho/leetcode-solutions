// Last updated: 31/03/2025 17:55:31
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            int temp = map.get(key);
            map.put(key, -1);
            if (map.containsValue(temp)) {
                return false;
            }
        }

         return true;
    }
}