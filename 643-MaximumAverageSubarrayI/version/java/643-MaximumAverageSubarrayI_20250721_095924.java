// Last updated: 21/07/2025 09:59:24
/*
 * O(n)
 * 
 * Sliding window method
*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double av;
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += nums[i];
        }

        av = (double) count / (double) k;

        for (int i = k; i < nums.length; i++) {
            count -= nums[i-k];
            count += nums[i];

            double t = (double) count / (double) k;

            av = Math.max(t, av);
        }

        return av;
    }
}