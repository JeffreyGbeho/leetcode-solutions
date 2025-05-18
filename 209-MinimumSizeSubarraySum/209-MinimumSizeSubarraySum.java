// Last updated: 18/05/2025 23:07:19
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

       for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                res = Math.min(res, i + 1 - left);
                sum -= nums[left++];
            }
        }

        return res != Integer.MAX_VALUE ? res : 0;
    }
}