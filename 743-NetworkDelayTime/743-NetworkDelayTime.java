// Last updated: 04/05/2026, 19:10:58
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        // 1. Construire l'adjacency list
4        Map<Integer, List<int[]>> graph = new HashMap<>();
5        for (int i = 1; i <= n; i++) graph.put(i, new ArrayList<>());
6        for (int[] time : times) {
7            graph.get(time[0]).add(new int[]{time[1], time[2]});
8        }
9
10        // 2. Min Heap (distance, nœud)
11        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
12        heap.offer(new int[]{0, k});
13
14        // 3. Distances
15        Map<Integer, Integer> visited = new HashMap<>();
16
17        while (!heap.isEmpty()) {
18            int[] curr = heap.poll();
19            int dist = curr[0], node = curr[1];
20
21            // Déjà visité → skip
22            if (visited.containsKey(node)) continue;
23            visited.put(node, dist);
24
25            // Explorer les voisins
26            for (int[] neighbor : graph.get(node)) {
27                if (!visited.containsKey(neighbor[0])) {
28                    heap.offer(new int[]{dist + neighbor[1], neighbor[0]});
29                }
30            }
31        }
32
33        // 4. Tous les nœuds atteints ?
34        if (visited.size() != n) return -1;
35        return Collections.max(visited.values());
36    }
37}