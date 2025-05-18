// Last updated: 18/05/2025 19:31:54
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