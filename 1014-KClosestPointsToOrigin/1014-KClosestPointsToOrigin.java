// Last updated: 30/07/2026, 22:22:13
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])
        );

        for (int[] point : points) {
            heap.offer(point);
        }

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }

        return res;
    }
}