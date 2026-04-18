// Last updated: 18/04/2026, 18:07:05
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int sum = 0;
4        int w = 0;
5        int res = Integer.MAX_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8            sum += nums[i];
9            w++;
10
11            while (sum >= target) {
12                res = Math.min(res, w);
13                sum -= nums[i+1-w];
14                w--;
15            }
16
17            if (sum >= target) {
18                res = Math.min(res, w);
19            }
20        }
21
22
23        return res == Integer.MAX_VALUE ? 0 : res;
24    }
25}