// Last updated: 20/04/2026, 14:31:40
1class Solution {
2    public boolean isValid(String s) {
3        List<Character> b = new ArrayList<>();
4        for (char c : s.toCharArray()) {
5            if (c == '(' || c == '{' || c == '[') {
6                b.add(c);
7            } else if (c == ')') {
8                if (b.size() > 0 && b.get(b.size() - 1) == '(') {
9                    b.remove(b.size() - 1);
10                } else {
11                    return false;
12                }
13            } else if (c == '}') {
14                if (b.size() > 0 && b.get(b.size() - 1) == '{') {
15                    b.remove(b.size() - 1);
16                } else {
17                    return false;
18                }
19            } else if (c == ']') {
20                if (b.size() > 0 && b.get(b.size() - 1) == '[') {
21                    b.remove(b.size() - 1);
22                } else {
23                    return false;
24                }
25            }
26        }
27
28        return b.size() == 0;
29    }
30}