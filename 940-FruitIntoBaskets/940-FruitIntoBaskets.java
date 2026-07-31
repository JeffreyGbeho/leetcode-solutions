// Last updated: 30/07/2026, 22:22:17
class Solution {
    public int totalFruit(int[] fruits) {
        int res = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            left++;

            while (map.size() > 2) {
                int n = i-left+1;
                map.put(fruits[n], map.get(fruits[n]) - 1);
                if (map.get(fruits[n]) == 0) {
                    map.remove(fruits[n]);
                }
                left--;
            }

            res = Math.max(res, left);
        }

        return res;
    }
}