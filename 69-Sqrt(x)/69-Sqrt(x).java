// Last updated: 16/05/2026, 11:00:14
1class Solution {
2    public int mySqrt(int x) {
3        long left = 0;
4        long right = x;
5        long mid = (right + left) / 2;
6
7        long res = mid * mid;
8
9        while (left < right) {
10            if (res == x) return (int) mid;
11
12            if (res < x) {
13                left = mid + 1;
14            } else {
15                right = mid - 1;
16            }
17
18            mid = (right + left) / 2;
19
20            res = mid * mid;
21        }
22
23        return res > x ? (int) (mid - 1) : (int) mid;
24    }
25}