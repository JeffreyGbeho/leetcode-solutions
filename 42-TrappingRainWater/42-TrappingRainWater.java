// Last updated: 10/12/2025 13:11:42
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int left = 0, right = n-1;
5        int leftMax = 0, rightMax = 0;
6        int res = 0;
7        while (left <= right) {
8            if (height[left] <= height[right]) {
9                if (height[left] >= leftMax) {
10                    leftMax = height[left];
11                } else {
12                    res += leftMax - height[left];
13                }
14                left++;
15            } else {
16                if (height[right] >= rightMax) {
17                    rightMax = height[right];
18                } else {
19                    res += rightMax - height[right];
20                }
21                right--;
22            }
23        }
24        return res;
25    }
26}