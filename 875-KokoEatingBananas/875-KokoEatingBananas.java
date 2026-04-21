// Last updated: 21/04/2026, 15:28:31
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        Arrays.sort(piles);
4
5        int min = 1;
6        int max = 0;
7        for (int pile : piles) {
8            max = Math.max(max, pile);
9        }
10
11
12        while (min < max) {
13            int mid = (max + min) / 2;
14
15            int sum = 0;
16            for (int pile : piles) {
17                sum += Math.ceil((double) pile / mid);;
18            }
19
20            if (sum <= h) {
21                max = mid;
22            } else {
23                min = mid + 1;
24            }
25        }
26
27        return min;
28    }
29}