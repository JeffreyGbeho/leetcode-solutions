// Last updated: 30/07/2026, 22:24:09
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums); // O(n log n)

        for (int i = 0; i < nums.length - 2; i++) { // O(n²)
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int target = 0 - nums[i];

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (left > i+1 && nums[left] == nums[left-1]) {
                    left++;
                    continue;
                }
                if (right < nums.length - 1 && nums[right] == nums[right+1]) {
                    right--;
                    continue;
                }

                if (target == nums[left] + nums[right]) {
                    res.add(Arrays.asList(nums[i],nums[left], nums[right]));
                    right--;
                    left++;
                } else if (target < nums[left] + nums[right]) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return res;
    }
}