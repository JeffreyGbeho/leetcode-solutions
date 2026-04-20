// Last updated: 20/04/2026, 19:12:28
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        Deque<Integer> stack = new ArrayDeque<>();
4        int[] res = new int[temperatures.length];
5
6        for (int i = 0; i < temperatures.length; i++) {
7            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.getLast()]) {
8                res[stack.getLast()] = i - stack.getLast();
9                stack.removeLast();
10            }
11
12            stack.addLast(i);
13        }
14
15        return res;
16    }
17}