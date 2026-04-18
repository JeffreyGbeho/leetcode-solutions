// Last updated: 18/04/2026, 11:05:04
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4
5        Arrays.sort(nums); // O(n log n)
6
7        for (int i = 0; i < nums.length - 2; i++) { // O(n²)
8            if (i > 0 && nums[i] == nums[i-1]) continue;
9
10            int target = 0 - nums[i];
11
12            int left = i + 1;
13            int right = nums.length - 1;
14
15            while (left < right) {
16                if (left > i+1 && nums[left] == nums[left-1]) {
17                    left++;
18                    continue;
19                }
20                if (right < nums.length - 1 && nums[right] == nums[right+1]) {
21                    right--;
22                    continue;
23                }
24
25                if (target == nums[left] + nums[right]) {
26                    res.add(Arrays.asList(nums[i],nums[left], nums[right]));
27                    right--;
28                    left++;
29                } else if (target < nums[left] + nums[right]) {
30                    right--;
31                } else {
32                    left++;
33                }
34            }
35        }
36
37        return res;
38    }
39}