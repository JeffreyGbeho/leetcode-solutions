// Last updated: 28/04/2026, 18:41:30
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        PriorityQueue<int[]> heap = new PriorityQueue<>(
4            (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])
5        );
6
7        for (int[] point : points) {
8            heap.offer(point);
9        }
10
11        int[][] res = new int[k][2];
12        for (int i = 0; i < k; i++) {
13            res[i] = heap.poll();
14        }
15
16        return res;
17    }
18}