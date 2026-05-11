// Last updated: 11/05/2026, 12:37:14
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        if (nums.length < 4) return new ArrayList<>();
4
5        List<List<Integer>> res = new ArrayList<>();
6        Arrays.sort(nums);
7
8        for (int i = 0; i < nums.length; i++) {
9            if (i > 0 && nums[i] == nums[i-1]) continue;
10            for (int j = i+1; j < nums.length; j++) {
11                if (j > i+1 && nums[j] == nums[j-1]) continue;
12                int k = j+1;
13                int l = nums.length-1;
14
15                while (k < l) { 
16                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
17                    if (sum == target) {
18                        res.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[k], nums[l]}));
19                        
20                        k++;
21                        while (k < nums.length && nums[k] == nums[k-1]) k++;
22                    } else if (sum > target) {
23                        l--;
24                    } else {
25                        k++;
26                    }
27                }
28            }
29        }
30
31        return res;
32    }
33}