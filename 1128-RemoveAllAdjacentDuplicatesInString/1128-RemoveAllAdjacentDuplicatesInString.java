// Last updated: 30/07/2026, 22:22:12
class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (stack.size() > 0 && stack.peek() == c) {
                stack.poll();
            } else {
                stack.push(c);
            }
        }

        String res = "";
        while (stack.size() > 0) {
            res += stack.pollLast();
        }

        return res;
    }
}