// Last updated: 23/05/2025 19:56:08
class Solution {
    public int[] sortedSquares(int[] nums) {
        // Solution 1
        // int[] res = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     res[i] = nums[i] * nums[i];
        // }
        
        // Arrays.sort(res);
        
        // return res;

        // Solution 2
        int n = nums.length;
        int[] res = new int[nums.length];
        int left = 0;
        int right = n - 1;
        for (int i = n -1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                square = nums[left];
                left++;
            } else {
                square = nums[right];
                right--;
            }
            res[i] = square * square;
        }

        return res;
    }
}