// Last updated: 03/10/2025 19:43:43
class Solution {
    public int missingNumber(int[] nums) {
        int[] t = new int[nums.length + 1];
        for (int num : nums) {
            t[num] = 1;
        }
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 0) {
                return i;
            }
        }
        
        return 0;
    }
}