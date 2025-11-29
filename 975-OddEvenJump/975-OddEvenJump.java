// Last updated: 29/11/2025 10:41:26
1class Solution {
2    public int oddEvenJumps(int[] A) {
3        int n  = A.length, res = 1;
4        boolean[] higher = new boolean[n], lower = new boolean[n];
5        higher[n - 1] = lower[n - 1] = true;
6        TreeMap<Integer, Integer> map = new TreeMap<>();
7        map.put(A[n - 1], n - 1);
8        for (int i = n - 2; i >= 0; --i) {
9            Map.Entry<Integer, Integer> hi = map.ceilingEntry(A[i]), lo = map.floorEntry(A[i]);
10            if (hi != null) higher[i] = lower[(int)hi.getValue()];
11            if (lo != null) lower[i] = higher[(int)lo.getValue()];
12            if (higher[i]) res++;
13            map.put(A[i], i);
14        }
15        return res;
16    }
17}