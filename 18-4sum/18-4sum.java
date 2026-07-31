// Last updated: 30/07/2026, 22:24:05
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < nums.length; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;

                while (k < l) { 
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if (sum == target) {
                        res.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[k], nums[l]}));
                        
                        k++;
                        while (k < nums.length && nums[k] == nums[k-1]) k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }

        return res;
    }
}