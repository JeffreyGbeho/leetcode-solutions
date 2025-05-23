// Last updated: 23/05/2025 19:23:18
import java.util.Arrays;
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.length-1;

        while (i < j) {
            if (nums[i] + nums[j] == k) {
                i++;
                j--;
                count++;
            } else if (k - nums[i] > nums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return count;
    }
}