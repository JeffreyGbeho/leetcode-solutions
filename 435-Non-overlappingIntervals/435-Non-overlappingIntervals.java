// Last updated: 02/05/2026, 16:20:10
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
5        int ans = 0;
6
7        for (int i = 1; i < list.size(); i++) {
8            if (list.get(i)[0] < list.get(i-1)[1]) {
9                if (list.get(i)[1] < list.get(i-1)[1]) {
10                    list.remove(i-1);
11                } else {
12                    list.remove(i);
13                }
14
15                ans++;
16                i--;
17            }
18        }
19
20        return ans;
21    }
22}