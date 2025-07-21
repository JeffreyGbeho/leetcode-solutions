// Last updated: 21/07/2025 13:29:03
/*
 * O(n)
 * 
 * pas convaincu de mon code. Je pense qu'on éviter des conditions inutiles
*/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;

        int res = 0;
        while (j < nums.length) {
            while (j < nums.length && k >= 0) {
                if (nums[j] == 0) {
                    k--;
                }
                if (k >= 0) {
                    j++;
                }
            }

            res = Math.max(res, j-i);

            if (nums[i] == 0) {
                k++;
            }
            i++;
            j++;
             if (j < nums.length && nums[j] == 0) {
                k--;
            }
        }

        return res;
    }
}