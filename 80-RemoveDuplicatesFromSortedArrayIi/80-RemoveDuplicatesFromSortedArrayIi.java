// Last updated: 30/07/2026, 22:23:45
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}