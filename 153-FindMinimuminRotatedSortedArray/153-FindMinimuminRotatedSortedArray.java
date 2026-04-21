// Last updated: 21/04/2026, 14:40:41
1class Solution {
2    public int findMin(int[] nums) {
3        int res = Integer.MAX_VALUE;
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left < right) {
8            int mid = (right + left) / 2;
9
10            if (nums[mid] > nums[right]) {
11                left  = mid + 1;
12            } else {
13                right = mid;
14            }
15        }
16
17        return nums[left];      
18    }
19}