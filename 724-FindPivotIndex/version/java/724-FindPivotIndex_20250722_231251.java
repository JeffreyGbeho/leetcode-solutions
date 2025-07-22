// Last updated: 22/07/2025 23:12:51
/*
 * O(n)
 * 
 * Easy
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int t = 0;

        for (int i = 0; i < nums.length; i++) {
            t += nums[i];
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (t - nums[i] - sum == sum) {
                return i;
            }

            sum += nums[i];
        }

        return -1;
    }
}