// Last updated: 24/04/2026, 19:28:25
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> subset = new ArrayList<>();
5
6        backTrack(0, nums, res, subset);
7
8        return res;
9    }
10
11    private void backTrack(int i, int[] nums, List<List<Integer>> res, List<Integer> subset) {
12        if (subset.size() == nums.length) {
13            res.add(new ArrayList<>(subset));
14            return;
15        }
16
17        for (int num : nums) {
18            if (!subset.contains(num)) {
19                subset.add(num);
20                backTrack(i+1, nums, res, subset);
21                subset.remove(Integer.valueOf(num));
22            }
23        }
24    }
25}