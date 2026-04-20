// Last updated: 20/04/2026, 13:07:52
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int num : nums) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7
8        List<Integer>[] bs = new List[nums.length + 1];
9        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
10            if (bs[entry.getValue()] == null) {
11                bs[entry.getValue()] = new ArrayList<>(); 
12            }
13            bs[entry.getValue()].add(entry.getKey());
14        }
15
16        int[] res = new int[k];
17        int index = 0;
18        for (int i = bs.length - 1; i >= 0 && index < k; i--) {
19            if (bs[i] != null) {
20                int j = 0;
21                while (j < bs[i].size()) {
22                    res[index] = bs[i].get(j);
23                    index++;
24                    j++;
25                }
26            }
27        }
28
29        return res;
30    }
31}