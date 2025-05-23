// Last updated: 23/05/2025 19:48:10
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        int l = nums.length;

        while (i < l && j < l) {
            if (nums[j] == 0 || j == i) {
                j++;
            } else if (nums[i] != 0) {
                i++;
            } else if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;                
                i++;
                j++;
            }
        }
    }
}