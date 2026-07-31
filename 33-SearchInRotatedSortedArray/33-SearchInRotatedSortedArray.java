// Last updated: 30/07/2026, 22:23:58
class Solution {
    public int search(int[] nums, int target) {
        int res = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;

            if (left == right && nums[left] == target) {
                return left;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid + 1] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }

        if (nums[left] == target) {
            return left;
        }

        return res;
    }
}