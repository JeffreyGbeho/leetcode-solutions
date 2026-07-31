// Last updated: 30/07/2026, 22:21:58
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);

        int bg = nums[nums.length - 1];

        int res = 0;
        int left = 1;
        int right = bg;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            int sum = 0;
            
            for (int i = 0; i < nums.length; i++) {
                sum += Math.ceil((double) nums[i] / mid);
            }

            if (sum <= threshold) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            mid = left + (right - left) / 2;
        }

        return res;
    }
}