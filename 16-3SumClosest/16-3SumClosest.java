// Last updated: 29/11/2025 10:43:13
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int closest_sum = Integer.MAX_VALUE / 2;  // A large value but not overflow
5        
6        for (int i = 0; i < nums.length - 2; ++i) {
7            int left = i + 1, right = nums.length - 1;
8            while (left < right) {
9                int current_sum = nums[i] + nums[left] + nums[right];
10                if (Math.abs(current_sum - target) < Math.abs(closest_sum - target)) {
11                    closest_sum = current_sum;
12                }
13                if (current_sum < target) {
14                    ++left;
15                } else if (current_sum > target) {
16                    --right;
17                } else {
18                    return current_sum;
19                }
20            }
21        }
22        
23        return closest_sum;
24    }
25}