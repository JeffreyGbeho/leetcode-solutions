// Last updated: 27/04/2026, 20:21:21
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        // Construire l'adjacency list
4        Map<Integer, List<Integer>> graph = new HashMap<>();
5        for (int i = 0; i < numCourses; i++) {
6            graph.put(i, new ArrayList<>());
7        }
8        for (int[] pre : prerequisites) {
9            graph.get(pre[1]).add(pre[0]);
10        }
11
12        Set<Integer> visiting = new HashSet<>();
13
14        for (int i = 0; i < numCourses; i++) {
15            if (!dfs(i, graph, visiting)) return false;
16        }
17
18        return true;
19    }
20
21    private boolean dfs(int course, Map<Integer, List<Integer>> graph, Set<Integer> visiting) {
22        // Cycle détecté
23        if (visiting.contains(course)) return false;
24        // Déjà vérifié — pas de cycle
25        if (graph.get(course).isEmpty()) return true;
26
27        visiting.add(course);
28
29        for (int neighbor : graph.get(course)) {
30            if (!dfs(neighbor, graph, visiting)) return false;
31        }
32
33        // Fini — retirer du chemin courant et vider pour marquer comme vérifié
34        visiting.remove(course);
35        graph.get(course).clear();
36
37        return true;
38    }
39}