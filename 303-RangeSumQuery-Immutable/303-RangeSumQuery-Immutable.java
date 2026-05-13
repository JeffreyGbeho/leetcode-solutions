// Last updated: 13/05/2026, 09:21:41
1class NumArray {
2    int[] nums;
3
4    public NumArray(int[] nums) {
5        this.nums = nums;
6    }
7    
8    public int sumRange(int left, int right) {
9        int res = 0;
10        for (int i = left; i <= right; i++) {
11            res += nums[i];
12        }
13
14        return res;
15    }
16}
17
18/**
19 * Your NumArray object will be instantiated and called as such:
20 * NumArray obj = new NumArray(nums);
21 * int param_1 = obj.sumRange(left,right);
22 */