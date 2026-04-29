// Last updated: 29/04/2026, 10:57:05
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        Map<Character, Integer> freq = new HashMap<>();
4        for (char task : tasks) {
5            freq.put(task, freq.getOrDefault(task, 0) + 1);
6        }
7
8        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
9        heap.addAll(freq.values());
10
11        int time = 0;
12
13        while (!heap.isEmpty()) {
14            List<Integer> temp = new ArrayList<>();
15            int tasksExecuted = 0;
16
17            for (int i = 0; i < n + 1; i++) {
18                if (!heap.isEmpty()) {
19                    int count = heap.poll();
20                    tasksExecuted++;
21                    if (count > 1) {
22                        temp.add(count - 1);
23                    }
24                }
25            }
26
27            heap.addAll(temp);
28            time += heap.isEmpty() ? tasksExecuted : n + 1;
29        }
30
31        return time;
32    }
33}