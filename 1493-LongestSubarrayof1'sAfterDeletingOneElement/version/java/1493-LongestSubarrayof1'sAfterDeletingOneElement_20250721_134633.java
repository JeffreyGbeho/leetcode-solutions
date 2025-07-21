// Last updated: 21/07/2025 13:46:33
/*
 * O(n)
 * 
 * sliding windows. EASY !
*/

class Solution {
    public int longestSubarray(int[] nums) {
        int z = 0;

        int s = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            }

            if (z <= 1) {
                res = Math.max(res, i-s);
            }

            if (z > 1) {
                z -= nums[s] == 0 ? 1 : 0;
                s++;
            }

        }

        return res;
    }
}