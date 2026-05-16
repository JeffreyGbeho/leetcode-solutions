// Last updated: 16/05/2026, 10:37:36
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int left = 1;
13        int right = n;
14        int mid = left + (right - left) / 2;
15
16        int res;
17
18        do {
19            res = guess(mid);
20
21            if (res == -1) {
22                right = mid - 1;
23            } else if (res == 1) {
24                left = mid + 1;
25            }
26
27            mid = left + (right - left) / 2;
28        }
29        while (res != 0);
30
31        return mid;
32    }
33}