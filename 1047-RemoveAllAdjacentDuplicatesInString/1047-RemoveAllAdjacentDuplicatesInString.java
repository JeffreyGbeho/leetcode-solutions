// Last updated: 24/05/2026, 10:10:53
1class Solution {
2    public String removeDuplicates(String s) {
3        Deque<Character> stack = new ArrayDeque<>();
4
5        for (char c : s.toCharArray()) {
6            if (stack.size() > 0 && stack.peek() == c) {
7                stack.poll();
8            } else {
9                stack.push(c);
10            }
11        }
12
13        String res = "";
14        while (stack.size() > 0) {
15            res += stack.pollLast();
16        }
17
18        return res;
19    }
20}