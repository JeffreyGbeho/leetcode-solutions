// Last updated: 03/10/2025 19:43:30
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double av;
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += nums[i];
        }

        av = (double) count / k;

        for (int i = k; i < nums.length; i++) {
            count -= nums[i-k];
            count += nums[i];

            av = Math.max((double) count / k, av);
        }

        return av;
    }
}