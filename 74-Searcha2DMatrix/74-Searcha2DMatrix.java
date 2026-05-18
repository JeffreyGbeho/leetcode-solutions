// Last updated: 18/05/2026, 14:41:17
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int length = matrix.length * matrix[0].length;
4        int left = 0;
5        int right = length-1;
6        int mid = length / 2;
7
8        while (left <= right) { 
9            int row = mid / matrix[0].length;
10            int col = mid % matrix[0].length;
11
12            if (target == matrix[row][col]) {
13                return true;
14            } else if (target < matrix[row][col]) {
15                right = mid - 1;
16            } else {
17                left = mid + 1;
18            }
19
20            mid = left + (right - left) / 2;
21        }
22
23        return false;
24    }
25}