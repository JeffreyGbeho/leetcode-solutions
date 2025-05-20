// Last updated: 20/05/2025 22:59:48
class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];     
                insertIndex++;
            }
        }
        return insertIndex;
    }
}