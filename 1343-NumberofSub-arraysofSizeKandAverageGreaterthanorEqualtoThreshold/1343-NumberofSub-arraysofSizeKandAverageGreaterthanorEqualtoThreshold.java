// Last updated: 12/05/2026, 08:21:25
1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        if (arr.length < k) return 0;
4        int res = 0;
5        int sum = 0;
6        for (int i = 0; i < k; i++) {
7            sum += arr[i];
8        }
9
10        if  (sum / k >= threshold) res++;
11
12        for (int i = k; i < arr.length; i++) {
13            sum += arr[i];
14            sum -= arr[i-k];
15
16            if  (sum / k >= threshold) res++; 
17        }
18
19        return res;
20    }
21}