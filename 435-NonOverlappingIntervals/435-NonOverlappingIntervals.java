// Last updated: 30/07/2026, 22:22:44
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                // overlap → supprimer celui qui finit le plus tard
                ans++;
                end = Math.min(end, intervals[i][1]);
            } else {
                // pas d'overlap → avancer
                end = intervals[i][1];
            }
        }

        return ans;
    }
}