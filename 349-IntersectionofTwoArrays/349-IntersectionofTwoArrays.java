// Last updated: 20/05/2026, 10:32:04
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> s2 = new HashSet<>();
4        for (int num : nums2) {
5            s2.add(num);
6        }
7
8        Set<Integer> res = new HashSet<>();
9        for (int num : nums1) {
10            if (s2.contains(num)) res.add(num);
11        }
12
13        List<Integer> t = new ArrayList<>(res);
14
15        int[] ans = new int[res.size()];
16        for (int i = 0; i < ans.length; i++) {
17            ans[i] = t.get(i);
18        }
19
20        return ans;
21    }
22}