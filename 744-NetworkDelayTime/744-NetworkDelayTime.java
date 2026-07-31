// Last updated: 30/07/2026, 22:22:28
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // 1. Construire l'adjacency list
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) graph.put(i, new ArrayList<>());
        for (int[] time : times) {
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }

        // 2. Min Heap (distance, nœud)
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[]{0, k});

        // 3. Distances
        Map<Integer, Integer> visited = new HashMap<>();

        while (!heap.isEmpty()) {
            int[] curr = heap.poll();
            int dist = curr[0], node = curr[1];

            // Déjà visité → skip
            if (visited.containsKey(node)) continue;
            visited.put(node, dist);

            // Explorer les voisins
            for (int[] neighbor : graph.get(node)) {
                if (!visited.containsKey(neighbor[0])) {
                    heap.offer(new int[]{dist + neighbor[1], neighbor[0]});
                }
            }
        }

        // 4. Tous les nœuds atteints ?
        if (visited.size() != n) return -1;
        return Collections.max(visited.values());
    }
}