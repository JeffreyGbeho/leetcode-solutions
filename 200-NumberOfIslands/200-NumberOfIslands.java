// Last updated: 30/07/2026, 22:23:20
class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    backTracking(i, j, grid);
                }
            }
        }

        return res;
    }

    private void backTracking(int m, int n, char[][] grid) {
        if (m < 0 || n < 0 || m >= grid.length || n >= grid[0].length) {
            return;
        }

        if (grid[m][n] == '0') return;

        grid[m][n] = '0';

        backTracking(m-1, n, grid);
        backTracking(m, n-1, grid);
        backTracking(m+1, n, grid);
        backTracking(m, n+1, grid);

        return;
    }
}