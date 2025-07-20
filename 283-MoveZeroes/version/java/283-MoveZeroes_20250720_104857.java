// Last updated: 20/07/2025 10:48:57
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;

        while (i < nums.length && j < nums.length && i < j) {
            while (i < nums.length && nums[i] != 0) {
                i++;
            }

            j = i + 1;
            while (j < nums.length && nums[j] == 0) {
                j++;
            }

            if (i < nums.length && j < nums.length && i < j) {
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
    }
}