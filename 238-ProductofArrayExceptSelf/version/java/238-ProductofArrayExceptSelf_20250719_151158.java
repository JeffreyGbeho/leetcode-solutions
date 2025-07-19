// Last updated: 19/07/2025 15:11:58
/*
 * O(n)
 * 
 * using division
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int max = 1;
        int z = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            }
            else {
                max *= nums[i];
            }
        }

        if (z > 1) {
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            if (z == 1) {
                if (nums[i] == 0) {
                    res[i] = max;
                }
            } else {
                res[i] = max / nums[i];
            }
        }

        return res;
    }
}