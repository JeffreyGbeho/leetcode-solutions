// Last updated: 30/07/2026, 22:22:20
class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for (char c : s.toCharArray()) {
            if (c == ')') {
                int v = stack.pop();
                if (v > 0) {
                    v *= 2;
                } else {
                    v += 1;
                }

                stack.push(stack.pop() + v);
            } else {
                stack.push(0);
            }
        }

        return stack.pop();
    }
}