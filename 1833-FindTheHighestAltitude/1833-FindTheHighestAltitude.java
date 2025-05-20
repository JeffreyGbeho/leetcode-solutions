// Last updated: 20/05/2025 23:42:14
class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            res = Math.max(res, sum);
        }

        return res;
    }
}