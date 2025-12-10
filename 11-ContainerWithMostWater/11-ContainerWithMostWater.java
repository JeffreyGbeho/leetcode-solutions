// Last updated: 09/12/2025 19:09:30
1class Solution {
2    public int maxArea(int[] height) {
3        int i = 0;
4        int j = height.length - 1;
5
6        int res = Integer.MIN_VALUE;
7
8        while (i < j) {
9            res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
10
11            if (height[i] < height[j]) {
12                i++;
13            } else {
14                j--;
15            }
16        }
17
18        return res;
19    }
20}