// Last updated: 20/05/2025 23:42:08
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        long[] prefix = new long[nums.length];
        
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        
        for (int i = k; i < nums.length - k; i++) {
            long minus = i-k == 0 ? 0 : prefix[i-k-1];
            res[i] = (int) ((prefix[i+k] - minus) / (2*k+1));
        }
        
        return res;
    
    }
}