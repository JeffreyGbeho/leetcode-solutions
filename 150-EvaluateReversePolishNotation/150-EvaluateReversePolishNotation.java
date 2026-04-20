// Last updated: 20/04/2026, 19:34:38
1class Solution {
2    Deque<Integer> stack = new ArrayDeque<>();
3
4    public int evalRPN(String[] tokens) {
5        for (String token : tokens) {
6            Integer v = null;
7            if (token.equals("+")) {
8                int[] val = extractValues();
9                v = val[0] + val[1];
10            } else if (token.equals("*")) {
11                int[] val = extractValues();
12                v = val[0] * val[1];
13            } else if (token.equals("-")) {
14                int[] val = extractValues();
15                v = val[0] - val[1];
16            } else if (token.equals("/")) {
17                int[] val = extractValues();
18                v = val[0] / val[1];
19            }
20
21            stack.addLast(v != null ? v : Integer.parseInt(token));
22        }
23
24        return stack.getLast();
25    }
26
27    private int[] extractValues() {
28        int[] r = new int[2];
29        r[1] = stack.getLast();
30        stack.removeLast();
31        r[0] = stack.getLast();
32        stack.removeLast();
33        
34        return r;
35    }
36}