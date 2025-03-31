// Last updated: 31/03/2025 09:50:21
/*
 * O(n)
 * Technique : Two pointers
*/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }

            if (k < 0) {
                k += 1 - nums[left];
                left++;
            }
        }

        return right - left;
    }
}