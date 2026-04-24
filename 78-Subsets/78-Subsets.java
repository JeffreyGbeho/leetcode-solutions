// Last updated: 24/04/2026, 12:57:19
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> subset = new ArrayList<>();
5
6        subRec(0, nums, res, subset);
7
8        return res;
9    }
10
11    private void subRec(int index, int[] nums, List<List<Integer>> res, List<Integer> subset) {
12        if (index == nums.length) {
13            res.add(new ArrayList<>(subset));
14            return;
15        }
16
17        subset.add(nums[index]);
18        subRec(index + 1, nums, res, subset);
19        subset.remove(subset.size() - 1);
20        subRec(index + 1, nums, res, subset);
21    }
22}