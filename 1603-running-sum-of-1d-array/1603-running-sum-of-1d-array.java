// Last updated: 18/05/2025 16:52:38
class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];
        
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        
        return prefix;
    }
}