// Last updated: 23/05/2025 19:23:31
class Solution {
    public int minStartValue(int[] nums) {
        // int[] prefix = new int[nums.length];
        
        // prefix[0] = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     prefix[i] = prefix[i-1] + nums[i];
        // }
        
        // Arrays.sort(prefix);
        
        // if (prefix[0] <= 0) {
        //     return Math.abs(prefix[0]) + 1;
        // } else {
        //     return 1;
        // }
        int minValue = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            minValue = Math.min(minValue, total);
        }

        if (minValue <= 0) {
            return Math.abs(minValue) + 1;
        } else {
            return 1;
        }
    }
}