// Last updated: 18/04/2026, 19:07:25
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int res = 0;
4        int left = 0;
5        Map<Integer, Integer> map = new HashMap<>();
6
7        for (int i = 0; i < fruits.length; i++) {
8            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
9            left++;
10
11            while (map.size() > 2) {
12                int n = i-left+1;
13                map.put(fruits[n], map.get(fruits[n]) - 1);
14                if (map.get(fruits[n]) == 0) {
15                    map.remove(fruits[n]);
16                }
17                left--;
18            }
19
20            res = Math.max(res, left);
21        }
22
23        return res;
24    }
25}