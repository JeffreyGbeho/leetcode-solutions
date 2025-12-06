// Last updated: 06/12/2025 10:45:46
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        // for (int i = 0; i < nums.length; i++) {
4        //     int t = target-nums[i];
5        //     for (int j = i+1; j < nums.length; j++) {
6        //         if (nums[j] == t) {
7        //             int[] res = {i, j};
8        //             return res;
9        //         }
10        //     }
11        // }
12
13        // return new int[2];
14
15        Map<Integer, Integer> sto = new HashMap<>();
16
17        for (int i = 0; i < nums.length; i++) {
18            if (sto.containsKey(nums[i])) {
19                int[] res = {sto.get(nums[i]), i};
20                return res;
21            }
22
23            int sum = target-nums[i];
24            sto.put(sum, i);
25        }
26
27        return new int[2];
28    }
29}