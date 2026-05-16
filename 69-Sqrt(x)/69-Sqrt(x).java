// Last updated: 16/05/2026, 11:08:19
1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0 || x == 1) return x;
4
5        int left = 0;
6        int right = x;
7        int mid = left + (right - left) / 2;
8
9        while (left <= right) {
10            long res = (long) mid * mid;
11
12            if (res == (long) x) return mid;
13
14            if (res < (long) x) {
15                left = mid + 1;
16            } else {
17                right = mid - 1;
18            }
19
20            mid = left + (right - left) / 2;
21        }
22
23        return Math.round(right);
24    }
25}