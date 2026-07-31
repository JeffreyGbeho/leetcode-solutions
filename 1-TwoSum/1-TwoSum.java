// Last updated: 30/07/2026, 22:24:13
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diff = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (diff.get(nums[i]) != null) {
                res[0] = diff.get(nums[i]);
                res[1] = i;
                return res;
            }

            if (diff.get(target - nums[i]) == null) {
                diff.put(target - nums[i], i);
            }
        }

        return res;
    }
}