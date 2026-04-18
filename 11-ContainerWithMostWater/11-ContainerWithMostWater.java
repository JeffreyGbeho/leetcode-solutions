// Last updated: 18/04/2026, 11:24:07
1class Solution {
2    public int maxArea(int[] height) {
3        int res = 0;
4        int i = 0;
5        int j = height.length - 1;
6
7        while (i < j) {
8            res = Math.max(res, Math.min(height[i], height[j]) * (j-i));
9
10            if (height[i] > height[j]) {
11                j--;
12            } else {
13                i++;
14            }
15        }
16
17        return res;
18    }
19}