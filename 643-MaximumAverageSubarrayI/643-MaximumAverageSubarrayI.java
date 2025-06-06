// Last updated: 23/05/2025 21:25:44
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