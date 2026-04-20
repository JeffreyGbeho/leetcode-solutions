// Last updated: 20/04/2026, 14:38:16
1class Solution {
2    public boolean isValid(String s) {
3        Deque<Character> b = new ArrayDeque<>();
4        for (char c : s.toCharArray()) {
5            if (c == '(' || c == '{' || c == '[') {
6                b.addLast(c);
7            } else if (c == ')') {
8                if (!b.isEmpty() && b.peekLast() == '(') {
9                    b.removeLast();
10                } else {
11                    return false;
12                }
13            } else if (c == '}') {
14                if (!b.isEmpty() && b.peekLast() == '{') {
15                    b.removeLast();
16                } else {
17                    return false;
18                }
19            } else if (c == ']') {
20                if (!b.isEmpty() && b.peekLast() == '[') {
21                    b.removeLast();
22                } else {
23                    return false;
24                }
25            }
26        }
27
28        return b.isEmpty();
29    }
30}