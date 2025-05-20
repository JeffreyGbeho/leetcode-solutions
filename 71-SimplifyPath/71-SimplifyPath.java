// Last updated: 20/05/2025 22:55:50
class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<String>();
        String[] items = path.split("/");

        for (String str : items) {
            if (str.equals(".") || str.isEmpty()) {
                continue;
            } else if (str.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.add(str);
            }
        }

        StringBuilder res = new StringBuilder();
        for (String dir : s) {
            res.append("/");
            res.append(dir);
        }

        return res.length() > 0 ? res.toString() : "/";
    }
}