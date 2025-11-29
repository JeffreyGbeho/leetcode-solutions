// Last updated: 29/11/2025 10:43:55
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3         List<List<Integer>> res = new ArrayList<>();
4        if (nums.length < 3) return res;
5
6        Arrays.sort(nums);// Sort array
7
8        for (int i = 0; i < nums.length - 2; i++) {
9            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
10            if (nums[i] > 0) break; 
11
12            int left = i + 1, right = nums.length - 1;
13            int target = -nums[i];
14
15            while (left < right) {
16                int sum = nums[left] + nums[right];
17                if (sum == target) {
18                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
19                    left++;
20                    right--;
21
22                    // skip duplicates
23                    while (left < right && nums[left] == nums[left - 1]) left++;
24                    while (left < right && nums[right] == nums[right + 1]) right--;
25                } else if (sum < target) {
26                    left++;
27                } else {
28                    right--;
29                }
30            }
31        }
32
33        return res;
34    }
35}