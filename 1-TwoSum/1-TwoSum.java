// Last updated: 08/02/2025 17:23:12
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var temp = map.get(target - nums[i]);
            if (temp != null) {
                int[] res = {temp, i};
                return res;
            }

            map.put(nums[i], i);
        }

        return null;
    }
}