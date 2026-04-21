// Last updated: 21/04/2026, 13:40:41
1class Solution {
2    public int search(int[] nums, int target) {
3        int res = -1;
4        int left = 0;
5        int right = nums.length - 1;
6        while (left < right) {
7            int mid = (right + left) / 2;
8
9            if (left == right && nums[left] == target) {
10                return left;
11            }
12
13            if (nums[left] <= nums[mid]) {
14                if (nums[left] <= target && target <= nums[mid]) {
15                    right = mid;
16                } else {
17                    left = mid + 1;
18                }
19            } else {
20                if (nums[mid + 1] <= target && target <= nums[right]) {
21                    left = mid + 1;
22                } else {
23                    right = mid;
24                }
25            }
26        }
27
28        if (nums[left] == target) {
29            return left;
30        }
31
32        return res;
33    }
34}