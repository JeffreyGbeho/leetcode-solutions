// Last updated: 03/06/2026, 10:43:13
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Deque<Integer> stack = new ArrayDeque<>();
4        stack.push(0);
5
6        for (char c : s.toCharArray()) {
7            if (c == ')') {
8                int v = stack.pop();
9                if (v > 0) {
10                    v *= 2;
11                } else {
12                    v += 1;
13                }
14
15                stack.push(stack.pop() + v);
16            } else {
17                stack.push(0);
18            }
19        }
20
21        return stack.pop();
22    }
23}