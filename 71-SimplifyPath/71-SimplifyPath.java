// Last updated: 24/05/2026, 17:51:37
1class Solution {
2    public String simplifyPath(String path) {
3        Deque<String> stack = new ArrayDeque<>();
4
5        String[] str = path.split("/");
6
7        for (String s : str) {
8            if (s.equals("..")) {
9                stack.poll();
10            } else if (!s.isEmpty() && !s.equals(".")) {
11                stack.push(s);
12            }
13        }
14
15        String res = "";
16
17        while (stack.size() > 0) {
18            res += "/" + stack.pollLast();
19        }
20
21        return res.isEmpty() ? "/" : res;
22    }
23}