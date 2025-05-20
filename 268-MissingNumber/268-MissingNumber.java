// Last updated: 20/05/2025 23:23:47
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