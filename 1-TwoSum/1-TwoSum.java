// Last updated: 03/10/2025 19:44:19
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Check if complement exists → return indices if found
            var temp = map.get(target - nums[i]);
            if (temp != null) {
                int[] res = {temp, i};
                return res;
            }

            // Store current number → index mapping
            map.put(nums[i], i);
        }

        return null;
    }
}