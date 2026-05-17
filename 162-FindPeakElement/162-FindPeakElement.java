// Last updated: 17/05/2026, 10:02:18
1class Solution {
2    public int findPeakElement(int[] nums) {
3        if (nums.length == 1) {
4            return 0;
5        }
6
7        int left = 0;
8        int right = nums.length - 1;
9        int mid = left + (right - left) / 2;
10
11        while (left <= right) {
12            long next = mid + 1 >= nums.length ? Long.MIN_VALUE : (long) nums[mid+1];
13            long prev = mid - 1 < 0 ? Long.MIN_VALUE : (long) nums[mid-1];
14            int curr = nums[mid];
15
16            if (curr > prev && curr > next) { 
17                return mid;
18            }
19
20            if (curr > prev && curr < next) {
21                left = mid + 1;
22            } else if (curr < prev && curr > next) {
23                right = mid - 1;
24            } else {
25                left = mid + 1;
26            }
27
28            mid = left + (right - left) / 2;
29        }
30
31        return right;
32    }
33}