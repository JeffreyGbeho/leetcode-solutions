// Last updated: 27/04/2026, 19:58:30
1class Solution {
2    public List<List<Integer>> pacificAtlantic(int[][] heights) {
3        Set<String> atl = new HashSet<>();
4        Set<String> pac = new HashSet<>();
5
6        for (int i = 0; i < heights[0].length; i++) {
7            dfs(0, i, heights, pac, 0);
8            dfs(heights.length-1, i, heights, atl, 0);
9        }
10
11        for (int i = 0; i < heights.length; i++) {
12            dfs(i, 0, heights, pac, 0);
13            dfs(i, heights[0].length-1, heights, atl, 0);
14        }
15
16        List<List<Integer>> res = new ArrayList<>();
17        for (String s : atl) {
18            if (pac.contains(s)) {
19                String[] parts = s.split(",");
20                res.add(Arrays.asList(Integer.parseInt(parts[0]), Integer.parseInt(parts[1])));
21            }
22        }
23        return res;
24    }
25
26    private void dfs(int m, int n, int[][] heights, Set<String> store, int prevHeight) {
27        if (m < 0 || n < 0 || m >= heights.length || n >= heights[0].length) return;
28        if (store.contains(m + "," + n)) return;
29        if (heights[m][n] < prevHeight) return;
30
31        store.add(m + "," + n);
32
33        dfs(m-1, n, heights, store, heights[m][n]);
34        dfs(m, n-1, heights, store, heights[m][n]);
35        dfs(m+1, n, heights, store, heights[m][n]);
36        dfs(m, n+1, heights, store, heights[m][n]);
37    }
38}