// Last updated: 30/07/2026, 22:23:53
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 0;
        int right = x;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            long res = (long) mid * mid;

            if (res == (long) x) return mid;

            if (res < (long) x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            mid = left + (right - left) / 2;
        }

        return Math.round(right);
    }
}