// Last updated: 16/05/2026, 10:13:14
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0;
4        int mid = nums.length / 2;
5        int right = nums.length - 1;
6
7        while (left <= right) {
8            if (nums[mid] == target) {
9                return mid;
10            }
11
12            if (target < nums[mid]) {
13                right = mid - 1;
14            } else {
15                left = mid + 1;
16            }
17
18            mid = (left + right) / 2;
19        }
20
21        if (nums[mid] < target) {
22            return mid + 1;
23        } else {
24            return mid - 1 < 0 ? 0 : mid - 1;
25        }
26    }
27}