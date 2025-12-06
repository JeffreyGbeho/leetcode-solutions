// Last updated: 06/12/2025 18:04:26
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> occ = new HashMap<>();
4
5        for (Integer num : nums) {
6            occ.put(num, occ.getOrDefault(num, 0) + 1);
7        }
8
9        HashMap<Integer, Integer> temp = occ.entrySet().stream().sorted((i1, i2)-> 
10            i2.getValue().compareTo(i1.getValue())).collect(
11            Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
12            (e1, e2) -> e1, LinkedHashMap::new));
13
14        int[] res = new int[k];
15
16        int j = 0;
17        for (Integer key : temp.keySet()) {
18            res[j] = key;
19            j++;
20
21            if (j >= k) {
22                break;
23            }
24        }
25
26        return res;
27    }
28}