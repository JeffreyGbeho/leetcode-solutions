// Last updated: 30/07/2026, 22:23:48
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix.length * matrix[0].length;
        int left = 0;
        int right = length-1;
        int mid = length / 2;

        while (left <= right) { 
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;

            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            mid = left + (right - left) / 2;
        }

        return false;
    }
}