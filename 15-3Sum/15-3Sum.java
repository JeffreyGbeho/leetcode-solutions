// Last updated: 09/12/2025 18:58:03
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3         List<List<Integer>> ans = new ArrayList<>();
4
5        // Sort the array
6        Arrays.sort(nums);
7
8        for (int i = 0; i < nums.length - 2; i++) {
9            // Skip duplicate elements for i
10            if (i > 0 && nums[i] == nums[i - 1]) {
11                continue;
12            }
13
14            int j = i + 1;
15            int k = nums.length - 1;
16
17            while (j < k) {
18                int sum = nums[i] + nums[j] + nums[k];
19
20                if (sum == 0) {
21                    // Found a triplet with zero sum
22                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
23
24                    // Skip duplicate elements for j
25                    while (j < k && nums[j] == nums[j + 1]) {
26                        j++;
27                    }
28
29                    // Skip duplicate elements for k
30                    while (j < k && nums[k] == nums[k - 1]) {
31                        k--;
32                    }
33
34                    // Move the pointers
35                    j++;
36                    k--;
37                } else if (sum < 0) {
38                    // Sum is less than zero, increment j to increase the sum
39                    j++;
40                } else {
41                    // Sum is greater than zero, decrement k to decrease the sum
42                    k--;
43                }
44            }
45        }
46        return ans;
47    }
48}