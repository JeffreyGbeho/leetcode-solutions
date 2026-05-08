// Last updated: 08/05/2026, 11:59:44
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int res = nums[0] + nums[1] + nums[2];
5
6        for (int i = 0; i < nums.length-2; i++) {
7            int left = i+1;
8            int right = nums.length -1;
9
10            while (left < right) {
11                int sum = nums[i] + nums[left] + nums[right];
12
13                if (sum == target) {
14                    return sum;
15                }
16
17                res = Math.abs(sum - target) < Math.abs(res - target) ? sum : res;
18
19                if (sum > target) {
20                    right--;
21                } else {
22                    left++;
23                }
24            }
25        }
26
27        return res;
28    }
29}