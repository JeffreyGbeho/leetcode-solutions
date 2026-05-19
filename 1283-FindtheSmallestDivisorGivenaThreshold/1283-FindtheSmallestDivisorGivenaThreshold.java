// Last updated: 19/05/2026, 15:10:35
1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        Arrays.sort(nums);
4
5        int bg = nums[nums.length - 1];
6
7        int res = 0;
8        int left = 1;
9        int right = bg;
10        int mid = left + (right - left) / 2;
11
12        while (left <= right) {
13            int sum = 0;
14            
15            for (int i = 0; i < nums.length; i++) {
16                sum += Math.ceil((double) nums[i] / mid);
17            }
18
19            if (sum <= threshold) {
20                res = mid;
21                right = mid - 1;
22            } else {
23                left = mid + 1;
24            }
25
26            mid = left + (right - left) / 2;
27        }
28
29        return res;
30    }
31}