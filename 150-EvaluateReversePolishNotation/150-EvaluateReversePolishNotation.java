// Last updated: 20/04/2026, 19:28:36
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Deque<Integer> stack = new ArrayDeque<>();
4
5        for (String token : tokens) {
6            Integer v = null;
7            if (token.equals("+")) {
8                int b = stack.getLast();
9                stack.removeLast();
10                int a = stack.getLast();
11                stack.removeLast();
12                v = a + b;
13            } else if (token.equals("*")) {
14                int b = stack.getLast();
15                stack.removeLast();
16                int a = stack.getLast();
17                stack.removeLast();
18                v = a * b;
19            } else if (token.equals("-")) {
20                int b = stack.getLast();
21                stack.removeLast();
22                int a = stack.getLast();
23                stack.removeLast();
24                v = a - b;
25            } else if (token.equals("/")) {
26                int b = stack.getLast();
27                stack.removeLast();
28                int a = stack.getLast();
29                stack.removeLast();
30                v = a / b;
31            }
32
33            stack.addLast(v != null ? v : Integer.parseInt(token));
34        }
35
36        return stack.getLast();
37    }
38}