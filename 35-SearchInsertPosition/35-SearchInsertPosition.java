// Last updated: 03/10/2025 19:43:57
class Solution {
    public int searchInsert(int[] nums, int target) {
        // Solution O(n)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}