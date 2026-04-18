// Last updated: 18/04/2026, 17:25:50
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        double sum = 0;
4        for (int i = 0; i < k; i++) {
5            sum += nums[i];
6        }
7
8        double average = sum / k;
9
10        for (int i = k; i < nums.length; i++) {
11            sum -= nums[i-k];
12            sum += nums[i];
13
14            average = Math.max(average, sum / k);
15        }
16
17        return average;
18    }
19}