// Last updated: 07/12/2025 10:12:39
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int ans[] = new int[n];
5        Arrays.fill(ans, 1);
6        int curr = 1;
7        for(int i = 0; i < n; i++) {
8            ans[i] *= curr;
9            curr *= nums[i];
10        }
11        curr = 1;
12        for(int i = n - 1; i >= 0; i--) {
13            ans[i] *= curr;
14            curr *= nums[i];
15        }
16        return ans;
17    }
18}