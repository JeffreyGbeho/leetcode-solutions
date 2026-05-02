// Last updated: 02/05/2026, 16:20:58
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4        int ans = 0;
5        int end = intervals[0][1];
6
7        for (int i = 1; i < intervals.length; i++) {
8            if (intervals[i][0] < end) {
9                // overlap → supprimer celui qui finit le plus tard
10                ans++;
11                end = Math.min(end, intervals[i][1]);
12            } else {
13                // pas d'overlap → avancer
14                end = intervals[i][1];
15            }
16        }
17
18        return ans;
19    }
20}