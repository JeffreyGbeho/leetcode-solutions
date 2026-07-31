// Last updated: 30/07/2026, 22:21:57
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if (arr.length < k) return 0;
        int res = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if  (sum / k >= threshold) res++;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i-k];

            if  (sum / k >= threshold) res++; 
        }

        return res;
    }
}