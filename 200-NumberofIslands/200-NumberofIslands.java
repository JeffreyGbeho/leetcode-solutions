// Last updated: 26/04/2026, 10:36:14
1class Solution {
2    public int numIslands(char[][] grid) {
3        int res = 0;
4
5        for (int i = 0; i < grid.length; i++) {
6            for (int j = 0; j < grid[0].length; j++) {
7                if (grid[i][j] == '1') {
8                    res++;
9                    backTracking(i, j, grid);
10                }
11            }
12        }
13
14        return res;
15    }
16
17    private void backTracking(int m, int n, char[][] grid) {
18        if (m < 0 || n < 0 || m >= grid.length || n >= grid[0].length) {
19            return;
20        }
21
22        if (grid[m][n] == '0') return;
23
24        grid[m][n] = '0';
25
26        backTracking(m-1, n, grid);
27        backTracking(m, n-1, grid);
28        backTracking(m+1, n, grid);
29        backTracking(m, n+1, grid);
30
31        return;
32    }
33}