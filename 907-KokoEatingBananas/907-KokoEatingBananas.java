// Last updated: 30/07/2026, 22:22:19
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }


        while (min < max) {
            int mid = (max + min) / 2;

            int sum = 0;
            for (int pile : piles) {
                sum += Math.ceil((double) pile / mid);;
            }

            if (sum <= h) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }
}