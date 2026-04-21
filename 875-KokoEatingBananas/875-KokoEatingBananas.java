// Last updated: 21/04/2026, 15:28:54
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int min = 1;
4        int max = 0;
5        for (int pile : piles) {
6            max = Math.max(max, pile);
7        }
8
9
10        while (min < max) {
11            int mid = (max + min) / 2;
12
13            int sum = 0;
14            for (int pile : piles) {
15                sum += Math.ceil((double) pile / mid);;
16            }
17
18            if (sum <= h) {
19                max = mid;
20            } else {
21                min = mid + 1;
22            }
23        }
24
25        return min;
26    }
27}