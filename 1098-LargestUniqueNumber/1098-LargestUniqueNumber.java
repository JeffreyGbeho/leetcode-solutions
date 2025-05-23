// Last updated: 23/05/2025 19:53:25
class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        
        int max = -1;
        
        for (int index : count.keySet()) {
            if (count.get(index) == 1) {
                max = Math.max(max, index);
            }
        }
        return max;
    }
}