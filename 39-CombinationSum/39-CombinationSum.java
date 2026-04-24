// Last updated: 24/04/2026, 19:58:22
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> subset = new ArrayList<>();
5
6        recurr(0, candidates, target, res, subset);
7
8        return res;
9    }
10
11    private void recurr(int index, int[] arr, int target, List<List<Integer>> res, List<Integer> subset) {
12        int com = subset.stream().reduce(0, (subtotal, element) -> subtotal + element);
13        if ( com == target) {
14            res.add(new ArrayList<>(subset));
15            return;
16        } else if (com > target || index == arr.length) {
17            return;
18        }
19
20        for (int i = index; i < arr.length; i++) {
21            subset.add(arr[i]);
22            recurr(i, arr, target, res, subset);
23            subset.remove(Integer.valueOf(arr[i]));
24        }
25    }
26}