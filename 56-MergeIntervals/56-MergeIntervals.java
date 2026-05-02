// Last updated: 02/05/2026, 10:35:10
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        List<int[]> ans = new ArrayList<>();
6        ans.add(intervals[0]);
7
8        for (int i = 1; i < intervals.length; i++) {
9            if (ans.get(ans.size() - 1)[1] >= intervals[i][0]) {
10                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
11            } else {
12                ans.add(intervals[i]);
13            }
14        }
15
16        return ans.toArray(new int[ans.size()][]);
17    }
18}