class Solution {
    public boolean increasingTriplet(int[] nums) {
        int l = Integer.MAX_VALUE;
        int m = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > m) {
                return true;
            } else if (n < l) {
                l = n;
            } else if (n > l && n < m) {
                m = n;
            }
        }

        return false;
    }
}