// Last updated: 20/05/2025 23:33:33
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        int t = 1;
        int zero = 0;

        for (int n : nums) {
            if (n != 0) {
                t *= n;
            } else {
                zero++;
            }
        }

        for (int i = 0; i < l; i++) {
            if (zero > 1) {
                res[i] = 0;
            } else if (zero == 1) {
                if (nums[i] == 0) {
                    res[i] = t;
                } else {
                    res[i] = 0;
                }
            } else {
                res[i] = t / nums[i];
            }
        }

        return res;
    }
}